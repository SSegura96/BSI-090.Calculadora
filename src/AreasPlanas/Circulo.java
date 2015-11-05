package AreasPlanas;
/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Circulo extends Figura
{
    private double radio;

    public Circulo() 
    {
        radio = 0;
    }//fin constructor
    
    @Override
    public void calcArea ()
    {
        area = Math.PI*Math.pow(radio, 2);
    }//fin metodo calcArea ()
}//fin clase Circulo
