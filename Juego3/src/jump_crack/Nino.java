package jump_crack;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;

public class Nino {
	Juego jueguito;
	
	//pa saber si el niño salta o no
	static boolean saltando = false;
	boolean sube = false;
	boolean baja = false;
	//esto delimita el area del objeto
	Area pieDelantero, pieTrasero, cuerpo, nino;
	//tamaño del personaje
	int anchoPersonaje=112;
	int altoPersonaje = 78;
	//coordenadas iniciales del personajes
	static int x_inicial = 50;
	static int y_inicial = 270;
	//coordenadas para manipular el personaje
	int x_auxiliar= 0;
	int y_auxiliar= 0;
	
	public Nino(Juego jueguito) {
		this.jueguito=jueguito;
	}
	
	public void mover() {
		if (x_inicial+x_auxiliar>0 && x_inicial+x_auxiliar<jueguito.getWidth()-anchoPersonaje) {
			x_inicial+=x_auxiliar;
		}
		
		if (saltando) { //si el niño esta en suelo
			if (y_inicial==270) {
				sube=true;
				y_auxiliar=-2;
				baja=false;
			}
			
			if (y_inicial==150) { //si el niño salto
				baja=true;
				y_auxiliar=2;
				sube=false;
			}
			
			if (sube) {
				y_inicial+=y_auxiliar;
			}
			
			if (baja) {
				y_inicial+=y_auxiliar;
				if (y_inicial==270) { //si el niño llego al suelo
					saltando=false;
				}
			}
		}
	}
	
	public void paint(Graphics2D g) {
		ImageIcon nino= new ImageIcon(getClass().getResource("/media/nino.gif"));
		g.drawImage(nino.getImage(), x_inicial, y_inicial, anchoPersonaje, altoPersonaje, null);
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_SPACE) {
			saltando = true;
		}
	}
	
	public Area getBounds() {
		Rectangle forma1 = new Rectangle(x_inicial, y_inicial, 95, 62);
		cuerpo = new Area(forma1);
		
		Ellipse2D forma2 = new Ellipse2D.Double(x_inicial, y_inicial+28, 48, 48);
		pieTrasero = new Area(forma2);
		
		Ellipse2D forma3 = new Ellipse2D.Double(x_inicial+73, y_inicial+39, 38, 38);
		pieDelantero = new Area(forma3);
		
		nino=cuerpo;
		nino.add(cuerpo);
		nino.add(pieTrasero);
		nino.add(pieDelantero);
		
		return nino;
	}
}
