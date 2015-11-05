package AreasPlanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ARomboide extends AFigura
{
    private double base;
    private double altura;

    public ARomboide() 
    {
        base = 0;
        altura = 0;
    }//fin constructor
    
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
    @Override
    public void calcArea ()
    {
       area = base * altura; 
    }//fin metodo calcArea ()
    
    @Override
    public void cargarImagen()
    {
        JOptionPane.showMessageDialog(null,"", "Romboide", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon("RUTA DE LA IMAGEN"));
    }//fin clase cargarImagen
}//fin clase ARomboide
