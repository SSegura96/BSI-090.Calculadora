package AreasPlanas;

/**
 * @author Sergio Segura Vidal
 */

public class Romboide extends Figura
{
    double base;
    double altura;

    public Romboide() 
    {
        base = 0;
        altura = 0;
    }
    
    @Override
    public void calcArea ()
    {
       area = base * altura; 
    }
}
