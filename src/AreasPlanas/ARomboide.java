package AreasPlanas;

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
    public void calcArea ()
    {
        setArea(base * altura); 
    }//fin metodo calcArea ()
    
    @Override
    public void pedirDatos()
    {
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base")));
               
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura")));
    }//fin clase pedirDatos
}//fin clase ARomboide
