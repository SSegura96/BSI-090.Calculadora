package AreasPlanas;

import java.text.DecimalFormat;
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
       figura = "Cuadrado";
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
    public void pedirDatos()
    {
        setValorLado(Double.parseDouble(JOptionPane.showInputDialog("Digite el lado:")));
    }//fin clase pedirDatos
    
    @Override
    public void calcArea ()
    {
        setArea(valorLado * valorLado);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+valorLado+"\n"
                + "Area: "+df.format(area);
    }//fin calcArea ()
    
}//fin clase ACuadrado
