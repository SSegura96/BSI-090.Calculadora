package PerimetrosPlanos;

import java.text.DecimalFormat;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class PCirculo extends PFigura {

    protected double radio;

    public PCirculo() {
        radio = 0;
        figura = "Circulo";
    }//fin constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void pedirDatos() throws NumberFormatException {
        radio = fallo.doubleValidarExcepciones("Digite el radio", figura);
    }//fin metodo pedirDatos ()

    @Override
    public void calcPerimetro() {
        perimetro = (2 * Math.PI) * radio;
        DecimalFormat df = new DecimalFormat("0.00");

        perimetro = enmascararDouble(perimetro);

        mensaje = "Radio: " + radio + "\n"
                + "Perimetro: " + df.format(perimetro);
    }//fin metodo calcPerimetro ()

}//fin clase PCirculo
