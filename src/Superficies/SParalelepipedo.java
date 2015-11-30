package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SParalelepipedo extends SFigura {

    private double ancho;
    private double largo;
    private double altura;

    public SParalelepipedo() {
        ancho = 0.0;
        largo = 0.0;
        altura = 0.0;
        figura = "Paralelepipedo";
    }//fin constructor

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void pedirDatos() {
        //Se pide el valor del ancho y se valida
        ancho = fallo.doubleValidarExcepciones("Digite el valor del ancho:", figura);

        //Se pide valor del largo y se valida
        largo = fallo.doubleValidarExcepciones("Digite el valor del largo:", figura);

        //Se pide la medida de la altura y se valida
        altura = fallo.doubleValidarExcepciones("Digite el valor de altura:", figura);

    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() {
        superficie = 2 * (ancho * largo + ancho * altura + largo * altura);

        mensaje = "Ancho: " + ancho + "\n"
                + "Largo: " + largo + "\n"
                + "Altura: " + altura + "\n"
                + "Superficie: " + decimalFormat.format(superficie);
    }//fin metodo calcSuperficie()

}//fin clase SParalelepipedo
