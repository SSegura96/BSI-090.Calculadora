package PerimatrosPlanos;

/**
 * @author Sergio Segura Vidal
 */

public abstract class PFigura implements PIFigura
{
    protected double perimetro;
    protected String ubicacion;

    public PFigura() 
    {
       perimetro = 0;
       ubicacion = "";
    }

    public double getPerimetro() 
    {
        return perimetro;
    }

    public void setPerimetro(double perimetro) 
    {
        this.perimetro = perimetro;
    }

    public String getUbicacion() 
    {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) 
    {
        this.ubicacion = ubicacion;
    }
    
}
