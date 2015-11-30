package Volumenes;

import CalculadoraAvanzada.ManejoErrores;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class VFigura implements VIFigura
{
    protected ManejoErrores fallo = new ManejoErrores ();
    protected String mensaje;
    protected String figura;
    protected double volumen;

    public VFigura() 
    {
        mensaje = "";
        volumen = 0;
    }

    public String getMensaje() 
    {
        return mensaje;
    }

    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }

    public double getVolumen() 
    {
        return volumen;
    }

    public void setVolumen(double volumen) 
    {
        this.volumen = volumen;
    }
    
    public double enmascararDouble(double numero)
    {
        String dato = "";
        
        DecimalFormat decimalFormat = new DecimalFormat("#######.##");
        
        dato = decimalFormat.format(numero);
        
        dato = dato.replace(',', '.');
        
        return Double.parseDouble(dato);
    }
    
    public void mostrarImagen ()
    {
        JOptionPane.showMessageDialog(null,"", figura,
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/"+figura+".png"));
    }
    
    public void mostarDatos ()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
