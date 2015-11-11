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
    
    
    public void mostrarImagen ()
    {
        JOptionPane.showMessageDialog(null,"", figura,
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/"+figura+".png"));
    }
    
    public void resultado ()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
   
}//fin clase Abstracta AFigura
