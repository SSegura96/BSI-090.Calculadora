package AreasPlanas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ARomboide extends AFigura
{
    private double base;
    private double altura;

    public ARomboide() 
    {
        base = 0;
        altura = 0;
        figura = "Romboide";
    }//fin constructor
    
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
    
    
    @Override
    public void pedirDatos()
    {
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base:"));
               
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura:"));
    }//fin clase pedirDatos
    
    @Override
    public double calcArea ()
    {
        area = base * altura;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base: "+base+"\n"
                + "Altura: "+altura+"\n"
                + "Area: "+df.format(area);
    return area;
    }//fin metodo calcArea ()
    
}//fin clase ARomboide
