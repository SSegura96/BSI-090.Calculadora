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
        setArea(valorLado * valorLado);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "El valor del lado es: "+valorLado+"\n"
                + "El area es: "+df.format(area);
    }//fin calcArea ()
    
    @Override
    public void pedirDatos()
    {
        setValorLado(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor del lado:")));
    }//fin clase pedirDatos
}//fin clase ACuadrado
