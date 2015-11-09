package PerimetrosPlanos;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public class PPoligonoRegular extends PFigura
{
    protected double numlados;
    protected double valorlado;

    public PPoligonoRegular()
    {
        numlados = 0;
        valorlado = 0;
    }

    public double getNumlados() 
    {
        return numlados;
    }
    
    @Override
    public void calcPerimetro()
    {
        perimetro = numlados * valorlado;
        
        mensaje = "Numero de lados: "+numlados+"\n"
                + "Valor del lado: "+valorlado+"\n"
                + "Perimetro: "+perimetro;
    }
    
    @Override
    public void pedirDatos()
    {
        numlados = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero de lados"));
    }
    
    public void setNumlados(double numlados) 
    {
        this.numlados = numlados;
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
