package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PCuadrado extends PFigura 
{
    protected double valorlado;

    public PCuadrado()
    {
        valorlado = 0;
        figura = "Cuadrado";
    }//fin constructor

    public double getValorlado() {
        return valorlado;
    }

    public void setValorlado(double valorlado) {
        this.valorlado = valorlado;
    }
    
    @Override
    public void pedirDatos ()
    {
        valorlado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado:"));
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorlado*4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+valorlado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro ()
    
}//fin clase PCuadrado
