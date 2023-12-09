package Juego;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Juego extends JPanel  {
    public static boolean haChocado=false;
    Piedras roca = new Piedras(this);
    Insecto bicho= new Insecto();
    public Juego(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                bicho.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String ruta = System.getProperty("user.dir");

        ImageIcon tela = new ImageIcon("C:\\Users\\MILENIUM\\Desktop\\SpiderGame\\src\\Images\\tela.png");
        g.drawImage(tela.getImage(),0,0,getWidth(),getHeight(),this);

        Font score =new Font("Arial",Font.BOLD,25);
        g.setFont(score);
        g.setColor(Color.blue);
        g.drawString("Puntaje: "+roca.obtenerPuntos(),250,50);
        bicho.paint(g);
        roca.paint(g);
        roca.mover();
        g.dispose();
    }
    public static void main(String[] args) {
        JFrame miVentana = new JFrame("Running Spider");
        Juego game = new Juego();
        miVentana.add(game);
        miVentana.setSize(700,700);//tamaño de la ventana
        miVentana.setVisible(true);//Se muestra visible
        miVentana.setResizable(false);//NO se pueda mover
        miVentana.setLocationRelativeTo(null);//inicia en el centro
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Se cierra con la última línea de código

        while (true){
            if(haChocado|Piedras.nivel==5){
                if (Piedras.nivel==5){JOptionPane.showMessageDialog(null,"Ganaste, Felicitaciones!");}
                int reiniciaJuego=JOptionPane.showConfirmDialog(null,"Haz Perdido, "
                        +"Quieres reiniciar el Juego?","Perdiste",JOptionPane.YES_NO_OPTION);
                if(reiniciaJuego==0){
                    reiniciaValores();
                }else if(reiniciaJuego==1){
                    System.exit(0);
                }
            }
            try {
                Thread.sleep(10);
            }catch (InterruptedException ex){
                System.out.println(ex.toString());
            }
            game.repaint();
        }
    }
    public static void reiniciaValores(){
        Piedras.yRoca1=600;
        Piedras.xRoca1=700;
        Piedras.yRoca2=700;
        Piedras.xRoca2=100;
        Piedras.yRoca3=-20;
        Piedras.xRoca3=600;
        Piedras.yRoca4=300;
        Piedras.xRoca4=-20;
        Insecto.x=10;
        Insecto.y=10;
        Piedras.nivel=1;
        haChocado=false;
        Piedras.puntos=0;
    }
}
