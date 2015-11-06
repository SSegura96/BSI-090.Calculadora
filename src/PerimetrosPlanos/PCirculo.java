package PerimetrosPlanos;

/**
 * @author Sergio Segura Vidal
 */

public class PCirculo extends PFigura
{
    protected double radio;
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = (2*Math.PI)*radio; 
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
