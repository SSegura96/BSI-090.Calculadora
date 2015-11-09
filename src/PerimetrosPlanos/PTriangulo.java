package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez & Sergio Segura
 */
public class PTriangulo extends PFigura
{
    private double lado1;
    private double lado2;
    private double lado3;

    public PTriangulo() 
    {
        this.lado1 = 0.0;
        this.lado2 = 0.0;
        this.lado3 = 0.0;
    }//fin constructor

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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    
    @Override
    public void calcPerimetro() 
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        if(lado1 == lado2 && lado2 == lado3)
        {
            perimetro = lado1*3;
            
            mensaje = "Tipo de Triangulo: Equilatero. \n"
                    + "Lado: "+lado1+"\n"
                    + "Perimetro: "+df.format(perimetro);
        }//fin primer if
        
        //Esta serie de tres if evalua en el caso de que el triangulo sea Isosceles
        if (lado1 == lado2 && lado1 != lado3)
        {
            perimetro = (lado1 + lado3)*2;
            
            mensaje = "Tipo de Triangulo: Isósceles. \n"
                    + "Primer lado: "+lado1+"\n"
                    + "Segundo lado: "+lado2+"\n"
                    + "Tercer lado: "+lado3+"\n"
                    + "Perimetro: "+df.format(perimetro);
        }//fin segundo if
        if (lado2 == lado3 && lado2 != lado1)
        {
            perimetro = (lado2 + lado1)*2;
            
            mensaje = "Tipo de Triangulo: Isósceles. \n"
                    + "Primer lado: "+lado1+"\n"
                    + "Segundo lado: "+lado2+"\n"
                    + "Tercer lado: "+lado3+"\n"
                    + "Perimetro: "+df.format(perimetro);
        }//fin tercer if
        if (lado1 == lado3 && lado1 != lado2)
        {
            perimetro = (lado1 + lado2)*2;
            
            mensaje = "Tipo de Triangulo: Isósceles. \n"
                    + "Primer lado: "+lado1+"\n"
                    + "Segundo lado: "+lado2+"\n"
                    + "Tercer lado: "+lado3+"\n"
                    + "Perimetro: "+df.format(perimetro);
        }//fin cuarto if
        
        if(lado1 != lado2 && 
                lado1 != lado3 && 
                lado2 != lado3)
        {
            perimetro = lado1 + lado2 + lado3;
            
            mensaje = "Tipo de Triangulo: Escaleno. \n"
                    + "Primer lado: "+lado1+"\n"
                    + "Segundo lado: "+lado2+"\n"
                    + "Tercer lado: "+lado3+"\n"
                    + "Perimetro: "+df.format(perimetro);
        }//fin quinto if
        
    }//fin metodo calcPerimetro()

    @Override
    public void pedirDatos() 
    {
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del primer lado:"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del segundo lado:"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del tercer lado:"));
        
    }//fin metodo pedirDtos
    
}//Fin clase PTriangulo