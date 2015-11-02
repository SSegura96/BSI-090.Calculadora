package AreasPlanas;

import javax.swing.ImageIcon;

/**
 *
 * @author Sergio Segura Vidal
 */
public abstract class Figura implements IFigura
{
   protected double area;
   protected String ubicacion;

    public Figura() {
       area = 0;
       ubicacion = "";
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
   
   
}
