package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class AFigura implements AIFigura
{
   protected double area;

    public AFigura() 
    {
       area = 0;
    }//fin constructor

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
   @Override
    public void calcArea()
    {
        
    }//fin metodo calcArea()
    
   @Override
    public void cargarImagen()
    {
        
    }//fin metodo cargarImagen()
   
}//fin clase Abstracta AFigura
