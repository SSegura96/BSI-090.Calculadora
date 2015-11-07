package PerimetrosPlanos;

/**
 * @author Sergio Segura Vidal
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
