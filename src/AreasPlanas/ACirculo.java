package AreasPlanas;
/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ACirculo extends Figura
{
    private double radio;

    public ACirculo() 
    {
        radio = 0;
    }//fin constructor
    
    @Override
    public void calcArea ()
    {
        area = Math.PI*Math.pow(radio, 2);
    }//fin metodo calcArea ()
}//fin clase ACirculo
