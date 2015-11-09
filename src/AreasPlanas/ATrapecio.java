package AreasPlanas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ATrapecio extends AFigura
{
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public ATrapecio() {
        this.baseMayor = 0.0;
        this.baseMenor = 0.0;
        this.altura = 0.0;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void calcArea() 
    {
        area = ((baseMayor + baseMenor)*altura)/2;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base Mayor: "+baseMayor+"\n"
                + "Base Menor: "+baseMenor+"\n"
                + "Altura: "+altura+"\n"
                + "Area: "+df.format(area);
    }//fin metodo calcArea()

    @Override
    public void pedirDatos() 
    {
       baseMayor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor de la base mayor:"));
       baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor de la base menor:"));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor de la altura:"));
    }//fin metodo pedirDatos()
    
}//fin clase Atrapecio