package PerimatrosPlanos;

/**
 * @author Sergio Segura Vidal
 */


//te paras github de mierda

public class Circulo extends Forma
{
    double radio;
    
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
