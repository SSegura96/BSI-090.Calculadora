package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class AFigura implements AIFigura
{
   protected double area;
   protected String ubicacion;

    public AFigura() 
    {
       area = 0;
       ubicacion = "";
    }//fin constructor

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) 
    {
        this.ubicacion = ubicacion;
    }
   
}//fin clase Abstracta AFigura
