package Juego;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
public class Insecto {
    public static int x=10, y=10;

    public void paint(Graphics g) {
        String ruta3 = System.getProperty("user.dir");
        ImageIcon hoyo = new ImageIcon("C:\\Users\\MILENIUM\\Desktop\\SpiderGame\\src\\Images\\hoyo.png");
        g.drawImage(hoyo.getImage(),500,500,150,150,null);

        String ruta2 = System.getProperty("user.dir");
        ImageIcon arana = new ImageIcon("C:\\Users\\MILENIUM\\Desktop\\SpiderGame\\src\\Images\\arana.png");
        g.drawImage(arana.getImage(),x,y,100,100,null);
    }
    public void keyPressed(KeyEvent e){ //Verifica cuando la tecle se presiona
        if(e.getKeyCode()==37){//Izquierda
            if(x>0){
                x=x-20;
            }
        }
        if(e.getKeyCode()==39){//Derecha
            if(x<580){
                x=x+20;
            }
        }
        if(e.getKeyCode()==38){//Arriba
            if(y>0){
                y=y-20;
            }
        }
        if(e.getKeyCode()==40){//Abajo
            if(y<580){
                y=y+20;
            }
        }
    }
    public Ellipse2D getBoundsBicho(){//Ubicacion de la araña
        return new Ellipse2D.Double(x+10,y+30,80,50);
    }
    public boolean llegaFinal(){
        Rectangle cuadrado = new Rectangle(520,520,110,110);
        Area cuadradoArea = new Area(cuadrado);
        return cuadradoArea.contains(getBoundsBicho().getBounds());
    }

}
