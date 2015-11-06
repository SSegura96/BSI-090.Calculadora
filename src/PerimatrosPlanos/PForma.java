package PerimatrosPlanos;

/**
 * @author Sergio Segura Vidal
 */

public abstract class PForma implements PIFigura
{
    double perimetro;
    String ubicacion;

    public PForma() 
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
