package PerimetrosPlanos;

import java.text.DecimalFormat;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PPoligonoRegular extends PFigura
{
    protected double numLados;
    protected double valorLado;

    public PPoligonoRegular()
    {
        numLados = 0;
        valorLado = 0;
        figura = "PoligonoRegular";
    }//fin constructor

    public double getNumLados() 
    {
        return numLados;
    }
    
    public void setNumLados(double numLados) 
    {
        this.numLados = numLados;
    }

    public double getValorLado() 
    {
        return valorLado;
    }

    public void setValorLado(double valorLado) 
    {
        this.valorLado = valorLado;
    }
    
    
    @Override
    public void pedirDatos() throws NumberFormatException
    {
       numLados = fallo.doubleValidarExcepciones("Digite el numero de lados", "Poligono Regular");
       valorLado = fallo.doubleValidarExcepciones("Digite el valor del lado", "Poligono Regular");
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro()
    {
        perimetro = numLados * valorLado;
        DecimalFormat df = new DecimalFormat("0.00");
        
        perimetro = enmascararDouble(perimetro);
        
        mensaje = "Numero de lados: "+numLados+"\n"
                + "Medida del lado: "+valorLado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()
    
}//fin clase PPoligonoRegular
