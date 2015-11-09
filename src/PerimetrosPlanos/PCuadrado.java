package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public class PCuadrado extends PFigura 
{
    protected double valorlado;

    public PCuadrado()
    {
        valorlado = 0;
    }
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorlado*4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Valor del lado: "+valorlado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }
    
    @Override
    public void pedirDatos ()
    {
        valorlado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado"));
    }
    
    public double getValorlado() 
    {
        return valorlado;
    }

    public void setValorlado(double valorlado) 
    {
        this.valorlado = valorlado;
    }
}
