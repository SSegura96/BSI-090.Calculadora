package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Cuadrado extends Figura
{
    double valorLado;

    public Cuadrado() 
    {
       valorLado = 0;
    }
    
    @Override
    public void calcArea ()
    {
        area = valorLado * valorLado;
    }
}
