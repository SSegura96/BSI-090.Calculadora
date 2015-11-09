package PerimetrosPlanos;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public abstract class PFigura implements PIFigura
{
    public double perimetro;
    protected String ubicacion;
    protected String mensaje;

    public PFigura() 
    {
       perimetro = 0;
       ubicacion = "";
    }
    
    public void resulatado ()
    {
        JOptionPane.showMessageDialog(null, mensaje);
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
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) 
    {
        this.ubicacion = ubicacion;
    }
    
}
