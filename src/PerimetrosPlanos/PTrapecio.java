package PerimetrosPlanos;

import java.text.DecimalFormat;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class PTrapecio extends PFigura
{
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;

    public PTrapecio() 
    {
        baseMayor = 0.0;
        baseMenor = 0.0;
        lado1 = 0.0;
        lado2 = 0.0;
        figura = "Trapecio";
    }//fin constructor

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
    public void pedirDatos() 
    {
        baseMayor = fallo.doubleValidarExcepciones("Digite el valor de la base mayor", figura);
        baseMayor = fallo.doubleValidarExcepciones("Digite el valor de la base menor", figura);
        baseMayor = fallo.doubleValidarExcepciones("Digite el valor de el lado 1", figura);
        baseMayor = fallo.doubleValidarExcepciones("Digite el valor de el lado 2", figura);
    }//fin metodo pedirDatos()
    
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
    
}//fin clase PTrapecio