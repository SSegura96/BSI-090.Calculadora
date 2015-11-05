package AreasPlanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ACuadrado extends AFigura
{
    private double valorLado;

    public ACuadrado() 
    {
       valorLado = 0;
    }//fin constructor

    public double getValorLado() 
    {
        return valorLado;
    }

    public void setValorLado(double valorLado) 
    {
        this.valorLado = valorLado;
    }
    
    
    @Override
    public void calcArea ()
    {
        area = valorLado * valorLado;
    }//fin calcArea ()
    
    @Override
    public void cargarImagen()
    {
        JOptionPane.showMessageDialog(null,"", "Cuadrado", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon("RUTA DE LA IMAGEN"));
    }//fin clase cargarImagen
}//fin clase ACuadrado
