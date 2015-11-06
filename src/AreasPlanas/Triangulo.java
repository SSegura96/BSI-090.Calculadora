package AreasPlanas;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Triangulo extends Figura
{
    private double medidaLado;

    public Triangulo() 
    {
        this.medidaLado = medidaLado;
    }

    public double getMedidaLado() 
    {
        return medidaLado;
    }

    public void setMedidaLado(double medidaLado) 
    {
        this.medidaLado = medidaLado;
    }
    
    @Override
    public void calcArea() 
    {
        //variable para guardar el valor del area
        double a;
        a = ((Math.sqrt(3))*Math.pow(medidaLado, 2))/4;
    }//fin metodo calcArea()
    
}//fin clase Triangulo