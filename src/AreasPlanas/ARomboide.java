package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ARomboide extends Figura
{
    double base;
    double altura;

    public ARomboide() 
    {
        base = 0;
        altura = 0;
    }//fin constructor
    
    @Override
    public void calcArea ()
    {
       area = base * altura; 
    }//fin metodo calcArea ()

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
    
}//fin clase ARomboide
