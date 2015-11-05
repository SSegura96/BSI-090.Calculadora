package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Romboide extends Figura
{
    double base;
    double altura;

    public Romboide() 
    {
        base = 0;
        altura = 0;
    }//fin constructor
    
    @Override
    public void calcArea ()
    {
       area = base * altura; 
    }//fin metodo calcArea ()
}//fin clase Romboide
