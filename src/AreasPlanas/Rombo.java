package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Rombo extends Figura 
{
    double diagMayor;
    double diagMenor;

    public Rombo() 
    {
        diagMayor = 0;
        diagMenor = 0;
    }
    
    @Override
    public void calcArea ()
    {
        area = (diagMayor*diagMenor)/2;
    }
}
