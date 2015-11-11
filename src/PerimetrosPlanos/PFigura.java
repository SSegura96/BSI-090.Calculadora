package PerimetrosPlanos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public abstract class PFigura implements PIFigura
{
    public double perimetro;
    protected String figura;
    protected String mensaje;

    public PFigura() 
    {
       perimetro = 0;
       figura = "";
    }
    
    public double getPerimetro() 
    {
        return perimetro;
    }

    public void setPerimetro(double perimetro) 
    {
        this.perimetro = perimetro;
    }

    public String getUbicacion() 
    {
        return figura;
    }

    public void setUbicacion(String ubicacion) 
    {
        this.figura = ubicacion;
    }
    
    public void mostrarImagen ()
    {
        JOptionPane.showMessageDialog(null,"", figura,
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/"+figura+".png"));
    }
    
    public void resulatado ()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
