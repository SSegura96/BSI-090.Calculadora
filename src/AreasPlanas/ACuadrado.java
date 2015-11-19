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
        do {
            valorLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado:"));

            if (valorLado <= 0) 
            {
                fallo.seleccionarMensaje(0, "Aviso", 2);
            }//fin if
        } while (valorLado <= 0);

    }//fin clase pedirDatos
    
    @Override
    public void calcArea ()
    {
        area = valorLado * valorLado;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+valorLado+"\n"
                + "Area: "+df.format(area);
    }//fin calcArea ()
    
}//fin clase ACuadrado
