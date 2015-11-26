package PerimetrosPlanos;

import java.text.DecimalFormat;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PCuadrado extends PFigura 
{
    protected double valorLado;

    public PCuadrado()
    {
        valorLado = 0;
        figura = "Cuadrado";
    }//fin constructor

    public double getValorlado() {
        return valorLado;
    }

    public void setValorlado(double valorlado) {
        this.valorLado = valorlado;
    }
    
    @Override
    public void pedirDatos () throws NumberFormatException
    {
       
        valorLado = fallo.doubleValidarExcepciones("Digite el valor del lado");
        
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorLado*4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+valorLado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro ()
    
}//fin clase PCuadrado
