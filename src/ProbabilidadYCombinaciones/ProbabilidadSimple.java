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
        todoBien = true;//se limpia la variable

        //Se pide la cantidad de elementos y se valida
        do {
            try {
                String valor = JOptionPane.showInputDialog(null, "Digite la "
                        + "cantidad total de elementos:", imagen, JOptionPane.INFORMATION_MESSAGE);
                if (valor.equals("") || valor.equals(" ")) {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;

                    throw new NumberFormatException();
                }//fin primer if de validacion

                cantidadElementos = Integer.parseInt(valor);

                if (cantidadElementos <= 0) {
                    tituloError = "Aviso";
                    tipoError = 0;
                    imgError = 2;

                    throw new NumberFormatException();
                }//fin segundo if de validacion

                todoBien = true;
            }//fin try
            catch (NumberFormatException e) {
                fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                todoBien = false;
            }//fin catch

        } while (!todoBien);

        //Se pide la posibilidad de escoger elementos y se valida
        do {
            try {
                String valor = JOptionPane.showInputDialog(null, "Digite la "
                        + "posibilidad de escoger un elemento diferente:",
                        imagen, JOptionPane.INFORMATION_MESSAGE);

                if (valor.equals("") || valor.equals(" ")) {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;

                    throw new NumberFormatException();
                }//fin primer if de validacion

                posibilidadEscoger = Integer.parseInt(valor);

                if (posibilidadEscoger <= 0) {
                    tituloError = "Aviso";
                    tipoError = 0;
                    imgError = 2;

                    throw new NumberFormatException();
                }//fin segundo if de validacion

                todoBien = true;
            }//fin try
            catch (NumberFormatException e) {
                fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                todoBien = false;
            }//fin catch

        } while (!todoBien);

    }//fin metodo pedirDatos()

    public void calcProbabilidadSimple() {
        probabilidad = cantidadElementos / posibilidadEscoger;
        DecimalFormat df = new DecimalFormat("0.00");

        mensaje = "Cantidad total de elementos: " + cantidadElementos + "\n"
                + "Cantidad de posibles elemntos: " + posibilidadEscoger + "\n"
                + "Probabilidad Simple: " + df.format(probabilidad) + "%";
    }//fin metodo calcProbabilidadSimple()

}//fin clase ProbabilidadSimple
