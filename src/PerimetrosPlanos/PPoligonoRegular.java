package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

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
    public void pedirDatos()
    {
        numLados = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero de lados:"));
        
        valorLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado:"));
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro()
    {
        perimetro = numLados * valorLado;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Numero de lados: "+numLados+"\n"
                + "Medida del lado: "+valorLado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()
    
}//fin clase PPoligonoRegular
