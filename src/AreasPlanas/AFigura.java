package AreasPlanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class AFigura implements AIFigura
{
    protected double area;
    protected String figura;
    protected String mensaje; 

   
    public AFigura() 
    {
       area = 0;
       mensaje = "";
    }//fin constructor
    
    public double getArea() 
    {
        return area;
    }

    public void setArea(double area) 
    {
        this.area = area;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public void mostrarImagen()
    {
        JOptionPane.showMessageDialog(null,"", figura,
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/"+figura+".png"));
    }//fin metodo mostrarImagen()
    
    public void resultado()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()
   
}//fin clase Abstracta AFigura
