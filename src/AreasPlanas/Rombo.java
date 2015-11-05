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
    }//fin constructor
    
    
    @Override
    public void calcArea ()
    {
        area = (diagMayor*diagMenor)/2;
    }//fin metodo calcArea ()
}//fin clase Rombo
