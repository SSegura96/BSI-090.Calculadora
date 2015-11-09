package Superficies;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class SFigura implements SIFigura
{
    protected double superficie;
    protected String mensaje;

    public SFigura() 
    {
        superficie = 0.0;
        mensaje = "";
    }//fin constructor

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public void mostrarImagen (String Figura)
    {
        JOptionPane.showMessageDialog(null,"", Figura,
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/"+Figura+".png"));
    }//fin metodo mostrarImagen
    
    public void resultado ()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}//fin clase SFigura