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
    }//fin constructor
    
    @Override
    public void calcArea ()
    {
        area = valorLado * valorLado;
    }//fin calcArea ()
}//fin clase Cuadrado
