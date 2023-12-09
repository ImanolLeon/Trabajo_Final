package jump_crack;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;

public class Toro {

	//onjeto de la clase juego
	Juego jueguito;
	//variables que delimitan el toro
	Area cabeza, cuerpo,toroo;
	//variables del tamaño del personaje
	int anchoToro= 70;
	int altoToro= 70;
	//coordenadas iniciales donde se ubica el objeto
	static int x_inicial = 1300;
	static int y_inicial = 270;
	//coordenadas para manipular el objeto
	static int x_auxiliar = -4;
	
	public Toro(Juego jueguito) {
		this.jueguito=jueguito;
	}
	
	public void mover() {
		if (x_inicial<=-100) {
			jueguito.puntos++;
			x_inicial=1300;
			
			if (jueguito.puntos==3 || jueguito.puntos==6 || jueguito.puntos==9 || jueguito.puntos==12) {
				x_auxiliar+=-2;
				jueguito.nivel++;
			}
		} else {
			if (colision()) {
				if (jueguito.vidas==0) {
					jueguito.finJuego();
				} else {
					jueguito.pierdeVida();
				}
			} else {
				x_inicial+=x_auxiliar;
			}
		}
	}

	public void paint(Graphics2D g) {
		ImageIcon animal = new ImageIcon(getClass().getResource("/media/toro.png"));
		g.drawImage(animal.getImage(), x_inicial, y_inicial, anchoToro, altoToro, null);
	}
	
	public Area getBounds() {
		Ellipse2D forma1 = new Ellipse2D.Double(x_inicial, y_inicial, 20, 20);
		cabeza = new Area(forma1);
		
		Rectangle forma2 = new Rectangle(x_inicial, y_inicial, 50, 50);
		cuerpo = new Area(forma2);
		
		toroo=cabeza;
		toroo.add(cabeza);
		toroo.add(cuerpo);
		
		return toroo;
	}
	
	public boolean colision() {
		Area areaA=new Area(jueguito.nino.getBounds());
		areaA.intersect(getBounds());
		
		return !areaA.isEmpty();
	}
}
