package PerimetrosPlanos;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public class PCirculo extends PFigura
{
    protected double radio;
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = (2*Math.PI)*radio;
        
        mensaje = "Radio: "+radio+"\n"
                + "Perimetro: "+perimetro;
    }

    @Override
    public void pedirDatos ()
    {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio"));
    }
    
    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    
}
