package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public class PRombo extends PFigura
{
    protected double valorLado;

    public PRombo()
    {
        valorLado = 0;
    }
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorLado*4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Valor del lado: "+valorLado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }
    
    @Override
    public void pedirDatos ()
    {
        valorLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado"));
    }
    
    public double getValorlado() 
    {
        return valorLado;
    }

    public void setValorlado(double valorlado) 
    {
        this.valorLado = valorlado;
    }
}
