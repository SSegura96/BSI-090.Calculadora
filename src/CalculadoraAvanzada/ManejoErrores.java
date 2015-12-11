package CalculadoraAvanzada;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

/*
 * Logo :
 * 
 *      0: Logo de "Error" 
 *      2: Logo de "Warning"
 * 
 * Indice :
 *
 *      n: tira un mensaje difente segun el indice.
 * 
 */
public class ManejoErrores {

    private String tituloError = "";
    int tipoError = 1;
    int imgError = 2;

    //Indice = mensaje en el vector, titulo = titulo de la ventana, logo = Error o Warning descrito arriba.
    public void seleccionarMensaje(int indice, String titulo, int logo) {
        String[] mensajesError = {
            "El valor no puede ser 0 o un numero negativo.",
            "No se digitaron valores validos.",
            "Digite solo numeros primos.",//Solo Gilbreath
            "Solo se pueden digitar numeros enteros en el intervalo de 2 a 10.",//Solo Gilbreath
            "El tamaño del vector2 tiene que ser igual al tamaño del vector1."//Solo para ArreglosUnidimensionales
        };

        JOptionPane.showMessageDialog(null, mensajesError[indice], titulo, logo);
    }//Fin metodo seleccionarMensaje(int indice, String titulo, int logo)

    /**
     * Este metodo muestra un mensaje en caso de que lo digtado se menor que
     * cero o no sea un numero el se encicla y vuelve a mostar el mensaje hasta
     * que el valor sea correcto
     *
     * @param mensaje
     * @param titulo
     * @return
     */
    public double doubleValidarExcepciones(String mensaje, String titulo) throws NumberFormatException {
        boolean todoBien = true;
        double valor = 0;

        do {
            try {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;

                valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                        mensaje, titulo, JOptionPane.INFORMATION_MESSAGE));

                if (valor <= 0) {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }//fin if

                todoBien = true;
            } catch (NumberFormatException e) {
                todoBien = false;
                seleccionarMensaje(tipoError, tituloError, imgError);
            }//fin try-catch

        } while (!todoBien);

        return valor;
    }//fin metodo doubleValidarExcepciones(String mensaje, String titulo)
}//fin clase ManejoErrores
