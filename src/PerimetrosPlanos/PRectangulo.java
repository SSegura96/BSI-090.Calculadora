package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez & Sergio Segura
 */
public class PRectangulo extends PFigura
{
    private double base;
    private double altura;

    public PRectangulo() 
    {
        this.base = 0.0;
        this.altura = 0.0;
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
    public void calcPerimetro()
    {
        perimetro = (base + altura)*2;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base: "+base+"\n"
                + "Altura: "+altura+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()

    @Override
    public void pedirDatos() 
    {
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura:"));
    }//fin metodo pedirDatos()
    
    
}//fin clase PRectangulo