package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class EscalarVectorial extends ArregloUnidimensional {

    private double[] escalarV;
    private double escalar;

    public EscalarVectorial() {
        escalarV = new double[0];
        escalar = 0.0;
    }//fin constructor

    public double[] getEscalarV() {
        return escalarV;
    }

    public void setEscalarV(double[] escalarV) {
        this.escalarV = escalarV;
    }

    public double getEscalar() {
        return escalar;
    }

    public void setEscalar(double escalar) {
        this.escalar = escalar;
    }

    @Override
    public void llenarVector() {
        JOptionPane.showMessageDialog(null, "Llenar el vector: vector[ ]",
                "Escalar Vectorial", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < vector.length; i++) {
            todoBien = true;//se limpia la variable

            //Se pide llenar el vector
            do {
                try {
                    String valor = JOptionPane.showInputDialog(null,
                            "Ingrese dato de: vector[" + (i+1) + "]", "Escalar Vectorial", JOptionPane.INFORMATION_MESSAGE);
                    if (valor.equals("") || valor.equals(" ")) {
                        tituloError = "Error";
                        tipoError = 1;
                        imgError = 0;

                        throw new NumberFormatException();
                    }//fin primer if de validacion

                    vector[i] = Double.parseDouble(valor);

                    if (vector[i] <= 0) {
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
        }//fin primer for

    }//fin metodo llenarVector()

    @Override
    public void pedirDatos() {

        todoBien = true;//se limpia la variable

        //Se pide el tamanno del vector
        do {
            try {
                String valor = JOptionPane.showInputDialog(null, "Digite el "
                        + "tamaño del vector:", "Escalar Vectorial", JOptionPane.INFORMATION_MESSAGE);
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

        vector = new double[tamanno];

        //Se pide el escalar
        do {
            try {
                String valorEscalar = JOptionPane.showInputDialog(null, "Digite "
                        + "el escalar:", "Escalar Vectorial", JOptionPane.INFORMATION_MESSAGE);
                if (valorEscalar.equals("") || valorEscalar.equals(" ")) {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;

                    throw new NumberFormatException();
                }//fin primer if de validacion

                escalar = Double.parseDouble(valorEscalar);

                if (escalar <= 0) {
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

        llenarVector();
    }//fin metodo pedirDatos()

    @Override
    public String recorrerVector(double[] vector1) {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) 
        {
            dato += "" + vector1[i] + ", ";
        }//foin primer for
        
        dato = dato.substring(0, dato.length()-2);
        return dato;

    }//fin metodo recorrerVector

    public void calcProductoV() {
        escalarV = new double[vector.length];

        for (int i = 0; i < vector.length; i++) {
            escalarV[i] = vector[i] * escalar;
        }//fin primer for

        mensaje = "Vector[ " + vector.length + " ]\n"
                + "Escalar: " + escalar + "\n"
                + "Escalar de las posiciones:\n" + recorrerVector(escalarV);
    }//fin metodo caclProductoV
}//fin clase EscalarVectorial
