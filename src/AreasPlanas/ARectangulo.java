package AreasPlanas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ARectangulo extends AFigura
{
    private double base;
    private double altura;
    private boolean todoBien = true;

    public ARectangulo() 
    {
        base = 0.0;
        altura = 0.0;
        figura = "Rectangulo";
    }//fin constructor

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void pedirDatos() 
    {
       
        altura = fallo.doubleValidarExcepciones("Digite el valor de la altura");
        base = fallo.doubleValidarExcepciones("Digite le valor de la base");
        
    }//fin metodo pedirDatos()
    
    @Override
    public double calcArea() 
    {
        area = base*altura;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base: "+base+"\n"
                + "Altura: "+altura+"\n"
                + "Area: "+df.format(area);
    return area;
    }//fin metodo calcArea()
    
}//fin clase ARectangulo