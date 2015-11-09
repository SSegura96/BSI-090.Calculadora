package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez & Sergio Segura
 */
public class PTrapecio extends PFigura
{
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;

    public PTrapecio() {
        this.baseMayor = 0.0;
        this.baseMenor = 0.0;
        this.lado1 = 0.0;
        this.lado2 = 0.0;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    
    @Override
    public void calcPerimetro() 
    {
        perimetro = baseMayor + baseMenor + lado1 + lado2;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base Mayor: "+baseMayor+"\n"
                + "Base Menor: "+baseMenor+"\n"
                + "Primer lado: "+lado1+"\n"
                + "Segundo lado: "+lado2+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()

    @Override
    public void pedirDatos() 
    {
       baseMayor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base mayor:"));
       baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base menor:"));
       lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del primer lado:"));
       baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del segundo lado:"));
       
    }//fin metodo pedirDatos()
    
}//fin clase PTrapecio