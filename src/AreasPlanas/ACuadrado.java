package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ACuadrado extends AFigura
{
    double valorLado;

    public ACuadrado() 
    {
       valorLado = 0;
    }//fin constructor
    
    @Override
    public void calcArea ()
    {
        area = valorLado * valorLado;
    }//fin calcArea ()

    public double getValorLado() 
    {
        return valorLado;
    }

    public void setValorLado(double valorLado) 
    {
        this.valorLado = valorLado;
    }
}//fin clase ACuadrado
