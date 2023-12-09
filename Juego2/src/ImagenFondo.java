import javax.swing.*;
import java.awt.*;

public class ImagenFondo extends JPanel {
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen=new ImageIcon(getClass().getResource("/Imagen/Fondo.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
