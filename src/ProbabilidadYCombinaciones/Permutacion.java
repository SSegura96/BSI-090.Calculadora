package ProbabilidadYCombinaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Permutacion extends ProbabilidadYCombinaciones {

    private int grupoElementos;
    private double permutacion;

    public Permutacion() {
        grupoElementos = 0;
        permutacion = 0;
        imagen = "Permutacion";
    }//fin constructor

    public int getGrupoElementos() {
        return grupoElementos;
    }

    public void setGrupoElementos(int grupoElementos) {
        this.grupoElementos = grupoElementos;
    }

    public double getPermutacion() {
        return permutacion;
    }

    public void setPermutacion(int permutacion) {
        this.permutacion = permutacion;
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

        //Se piden los grupos de elementos y se valida
        do {
            try {
                String valor = JOptionPane.showInputDialog(null, "Digite en "
                        + "grupos de cuanto quiere agrupar los elementos:",
                        imagen, JOptionPane.INFORMATION_MESSAGE);

                if (valor.equals("") || valor.equals(" ")) {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;

                    throw new NumberFormatException();
                }//fin primer if de validacion

                grupoElementos = Integer.parseInt(valor);

                if (grupoElementos <= 0) {
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

    public void calcPermutacion() {
        //Se saca el factorial de ambos elementos para generar la formula
        Factorial facNumElementos = new Factorial();
        facNumElementos.setNumero(cantidadElementos);

        Factorial facOperacion = new Factorial();
        facOperacion.setNumero(cantidadElementos - grupoElementos);

        permutacion = facNumElementos.calcFactorial() / facOperacion.calcFactorial();

        mensaje = "Cantidad de Elementos: " + cantidadElementos + "\n"
                + "Grupos de elementos: " + grupoElementos + "\n"
                + "Permutacion: " + permutacion;

    }//fin metodo calcPermutacion()

}//fin clase Permutacion
