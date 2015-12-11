package ProbabilidadYCombinaciones;

import java.text.DecimalFormat;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ProbabilidadSimple extends ProbabilidadYCombinaciones {

    protected double posibilidadEscoger;//posibilidades de escoger un elemento
    protected double probabilidad;//probabilidad simple
    protected double factorial;

    public ProbabilidadSimple() {
        posibilidadEscoger = 0.0;
        probabilidad = 0.0;
        factorial = 0;
    }//fin constructor

    public double getPosibilidadEscoger() {
        return posibilidadEscoger;
    }

    public void setPosibilidadEscoger(double posibilidadEscoger) {
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

        cantidadElementos = fallo.doubleValidarExcepciones("Digite la cantidad "
                + "total de elementos:", "Probabilidad Simple");

        posibilidadEscoger = fallo.doubleValidarExcepciones("Digite la posibilidad"
                + " de escoger un elemento diferente:", "Probabilidad Simple");
    }//fin metodo pedirDatos()

    public void calcProbabilidadSimple() {
        probabilidad = cantidadElementos / (int) posibilidadEscoger;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        mensaje = "Cantidad total de elementos: " + cantidadElementos + "\n"
                + "Cantidad de posibles elementos: " + posibilidadEscoger + "\n"
                + "Probabilidad Simple: " + decimalFormat.format(probabilidad) + "%";
    }//fin metodo calcProbabilidadSimple()

}//fin clase ProbabilidadSimple
