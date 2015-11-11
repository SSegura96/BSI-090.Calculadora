package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public class PCirculo extends PFigura
{
    protected double radio;

    public PCirculo()
    {
        radio = 0;
        figura = "Circulo";
    }
    
    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = (2*Math.PI)*radio;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Radio: "+radio+"\n"
                + "Perimetro: "+df.format(perimetro);
    }

    @Override
    public void pedirDatos ()
    {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio"));
    }
}
