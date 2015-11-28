package Estadistica;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Moda extends abEstadistica {

    private int maximaVecesQueSeRepite;
    private double moda;
    private double[] vectorModa;
    private int tamanno;

    public Moda() {
        maximaVecesQueSeRepite = 0;
        moda = 0.0;
        vectorModa = new double[0];
        tamanno = 0;
        imagen = "Moda";
    }//fin constructor

    public int getMaximaVecesQueSeRepite() {
        return maximaVecesQueSeRepite;
    }

    public void setMaximaVecesQueSeRepite(int maximaVecesQueSeRepite) {
        this.maximaVecesQueSeRepite = maximaVecesQueSeRepite;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }

    public double[] getVectorModa() {
        return vectorModa;
    }

    public void setVectorModa(double[] vectorModa) {
        this.vectorModa = vectorModa;
    }

    public int getTamanno() {
        return tamanno;
    }

    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }

    public void llenarVector() {
        for (int i = 0; i < vectorModa.length; i++) {
            todoBien = true;//se limpia la variable

            //Se pide llenar el vector
            do {
                try {
                    String valor = JOptionPane.showInputDialog(null,
                            "Ingrese el dato #" + (i + 1) + " :", imagen, JOptionPane.INFORMATION_MESSAGE);
                    if (valor.equals("") || valor.equals(" ")) {
                        tituloError = "Error";
                        tipoError = 1;
                        imgError = 0;

                        throw new NumberFormatException();
                    }//fin primer if de validacion

                    vectorModa[i] = Double.parseDouble(valor);

                    if (vectorModa[i] <= 0) {
                        tituloError = "Aviso";
                        tipoError = 0;
                        imgError = 2;

                        throw new NumberFormatException();
                    }//fin segundo if de validacion

                    todoBien = true;
                }//fin try//fin try
                catch (NumberFormatException e) {
                    fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                    todoBien = false;
                }//fin catch

            } while (!todoBien);
        }//fin primer for

    }//fin metodo llenarVector()

    public void pedirDatos() {
        todoBien = true;//Se limpia la variable

        //Se pide pide el tamaño del vector
        do {
            try {
                String valor = JOptionPane.showInputDialog(null, "Digite la "
                        + "cantidad de numeros que va ingresar:", imagen, JOptionPane.INFORMATION_MESSAGE);

                if (valor.equals("") || valor.equals(" ")) {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;

                    throw new NumberFormatException();
                }//fin primer if de validacion

                tamanno = Integer.parseInt(valor);

                if (tamanno <= 0) {
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

        vectorModa = new double[tamanno];

        llenarVector();
    }//fin metodo pedirDatos()

    public String recorrerVector(double[] vector1) {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) {
            dato += "" + vector1[i] + ", ";
        }//foin primer for

        return dato;

    }//fin metodo recorrerVector

    public void calcModa() {
        for (int i = 0; i < vectorModa.length; i++) {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < vectorModa.length; j++) {
                if (vectorModa[i] == vectorModa[j]) {
                    vecesQueSeRepite++;
                }//fin primer if

            }//fin segundo for
            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                moda = vectorModa[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }//fin segundo if

        }//fin primer for
        mensaje = "La moda: " + moda + "\n"
                + "Se repitio: " + maximaVecesQueSeRepite + "\n"
                + "Valores: " + recorrerVector(vectorModa);
    }//fin metodo calcModa()

}//fin clase Moda
