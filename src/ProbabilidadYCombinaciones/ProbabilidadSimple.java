package ProbabilidadYCombinaciones;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ProbabilidadSimple extends ProbabilidadYCombinaciones {

    protected int posibilidadEscoger;//posibilidades de escoger un elemento
    protected double probabilidad;//probabilidad simple
    protected int factorial;

    public ProbabilidadSimple() {
        posibilidadEscoger = 0;
        probabilidad = 0.0;
        factorial = 0;
    }//fin constructor

    public int getPosibilidadEscoger() {
        return posibilidadEscoger;
    }

    public void setPosibilidadEscoger(int posibilidadEscoger) {
        this.posibilidadEscoger = posibilidadEscoger;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    @Override
    public void pedirDatos() {
        
        cantidadElementos = fallo.intValidarExcepciones("Digite la cantidad "
                + "total de elementos:", imagen);

        posibilidadEscoger = fallo.intValidarExcepciones("Digite la posibilidad"
                + " de escoger un elemento diferente:", imagen);
    }//fin metodo pedirDatos()

    public void calcProbabilidadSimple() {
        probabilidad = cantidadElementos / posibilidadEscoger;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        mensaje = "Cantidad total de elementos: " + cantidadElementos + "\n"
                + "Cantidad de posibles elemntos: " + posibilidadEscoger + "\n"
                + "Probabilidad Simple: " + decimalFormat.format(probabilidad) + "%";
    }//fin metodo calcProbabilidadSimple()

}//fin clase ProbabilidadSimple
