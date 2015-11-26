package PerimetrosPlanos;

import java.text.DecimalFormat;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PRombo extends PFigura
{
    protected double valorLado;

    public PRombo()
    {
        valorLado = 0;
        figura = "Rombo";
    }//fin constructor

    public double getValorLado() {
        return valorLado;
    }

    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
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
    }//fin metodo calcPerimetro()
    
}//fin clase PRombo
