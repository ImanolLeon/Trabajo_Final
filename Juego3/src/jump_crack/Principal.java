package jump_crack;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static int reiniaJuego=-1;
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "¿Estas listo crack?");
		JFrame ventana = new JFrame("Jueguito");
		Juego jueguito = new Juego();
		ventana.add(jueguito);
		ventana.setSize(1300, 400);
		ventana.setLocation(70, 200);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			if (jueguito.juegoFinalizado) {
				reiniaJuego = JOptionPane.showConfirmDialog(null, "Haz perdido, ¿Quieres Jugar de Nuevo", "Haz Perdido", JOptionPane.YES_NO_OPTION);
				if (reiniaJuego==0) {
					reiniciaValores();
				} else if(reiniaJuego==1) {
					System.exit(0);
				}
			} else {
				jueguito.repaint();
				try {
					Thread.sleep(10);
				} catch (InterruptedException ex) {
					Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				}
				
				if (Juego.pierdeVida==true) {
					JOptionPane.showMessageDialog(null, "Cuidado Crack!!!");
					Juego.pierdeVida=false;
					Juego.vidas--;
					Nino.y_inicial=270;
					Nino.saltando=false;
					Toro.x_inicial= 1300;
				}
			}
			
		}
	}

	public static void reiniciaValores() {
		Juego.juegoFinalizado = false;
		Toro.x_auxiliar=-4;
		Juego.puntos = 0;
		Juego.nivel= 1;
		Juego.vidas= 3;
		reiniaJuego= -1;
		Toro.x_inicial = 1300;
	}
}
