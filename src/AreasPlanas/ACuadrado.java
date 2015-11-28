package AreasPlanas;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ACuadrado extends AFigura 
{

    private double valorLado;

    public ACuadrado() 
    {
        valorLado = 0;
        figura = "Cuadrado";
    }//fin constructor

    public double getValorLado() {
        return valorLado;
    }

    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }

    
    @Override
    public void pedirDatos() 
    {
        valorLado = fallo.doubleValidarExcepciones("Digite el valor del lado:", figura);
    }//fin clase pedirDatos

    @Override
    public double calcArea() 
    {
        area = valorLado * valorLado;

        mensaje = "Lado: " + valorLado + "\n"
                + "Area: " + decimalFomrat.format(area);
        return area;
    }//fin calcArea ()

}//fin clase ACuadrado
