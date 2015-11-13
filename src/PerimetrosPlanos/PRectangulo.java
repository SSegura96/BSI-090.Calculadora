package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class PRectangulo extends PFigura
{
    private double base;
    private double altura;

    public PRectangulo() 
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
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base:"));
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura:"));
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro()
    {
        perimetro = (base + altura)*2;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base: "+base+"\n"
                + "Altura: "+altura+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()
    
}//fin clase PRectangulo