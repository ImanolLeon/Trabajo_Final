package jump_crack;

import java.awt.Graphics2D;

import javax.swing.ImageIcon;

public class Fondo {
	Juego jueguito;
	//tamaño de fondo
	int anchoFondo= 1300;
	int alto_Fondo= 400;
	//coordenadas iniciales para mover el Fondo
	int x1= 1300;
	int y1=0;
	//coordenadas auxiliares que mueven otro fondo
	int x2= 0;
	int y2= 0;
	
	public Fondo(Juego jueguito) {
		this.jueguito=jueguito;
	}
	
	public void mover() {
		x1-=2;
		x2-=2;
		if(x1==0 && x2==-1300) {
			x1=1300;
			x2=0;
		}
	}
	
	public void paint (Graphics2D g) {
		ImageIcon imagenFondo= new ImageIcon(getClass().getResource("/media/fondo.jpg"));
		g.drawImage(imagenFondo.getImage(), x1, y1, anchoFondo, alto_Fondo, null);
		g.drawImage(imagenFondo.getImage(), x2, y2, anchoFondo, alto_Fondo, null);
		
	}

}
