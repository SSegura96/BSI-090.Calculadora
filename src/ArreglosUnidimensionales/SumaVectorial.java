package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SumaVectorial extends ArregloUnidimensional {

    private double[] sumaV;

    public SumaVectorial() {
        sumaV = new double[0];
    }//fin constructor

    public double[] getSumaV() {
        return sumaV;
    }

    public void setSumaV(double[] sumaV) {
        this.sumaV = sumaV;
    }

    @Override
    public void llenarVector() {

        //Se llena el primer vector
        JOptionPane.showMessageDialog(null, "Llenar el primer vector: vector[ ]",
                "Suma Vectorial", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < vector.length; i++) {
            vector[i] = fallo.doubleValidarExcepciones("Ingrese dato de: "
                    + "vector[" + (i) + "]", "Suma Vectorial");
        }//fin primer for

        //Se llena el segundo vector
        JOptionPane.showMessageDialog(null, "Llenar el segundo vector: vector2[ ]",
                "Suma Vectorial", JOptionPane.INFORMATION_MESSAGE);
        
        for (int j = 0; j < vector2.length; j++) {
            vector2[j] = fallo.doubleValidarExcepciones("Ingrese dato de: "
                    + "vector2[" + (j) + "]", "Suma Vectorial");
        }//fin segundo for

    }//fin metodo llenarVector()

    @Override
    public void pedirDatos() {

        //Se pide el tamaño del primer vector
        tamanno = fallo.doubleValidarExcepciones("Digite el tamaño del "
                + "primer vector:", "Suma Vectorial");

        vector = new double[ (int) tamanno];

        tamanno = fallo.doubleValidarExcepciones("Digite el tamaño del segundo vector:",
                "Suma Vectorial");

        //Se pide el tamanno del segundo vector
        while (tamanno != vector.length) {

            //Exepcion creada por motivos externos y validar que ambos vectores sean del mismo tamaño
            if (tamanno != vector.length) {
                JOptionPane.showMessageDialog(null, "Los vectores tienen que ser del "
                        + "mismo tamaño.", "Aviso", JOptionPane.WARNING_MESSAGE);

                tamanno = fallo.doubleValidarExcepciones("Digite el tamaño del segundo vector:",
                        "Suma Vectorial");
            }//fin if de validacion
        }//fin while
        vector2 = new double[ (int) tamanno];
        llenarVector();
    }//fin metodo pedirDatos()

    @Override
    public String recorrerVector(double[] vector1) {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) {
            dato += "" + vector1[i] + ", ";
        }//foin primer for

        dato = dato.substring(0, dato.length() - 2);
        return dato;

    }//fin metodo recorrerVector

    public void calcSumaV() {
        sumaV = new double[vector.length];

        for (int i = 0; i < vector.length; i++) {
            sumaV[i] = vector[i] + vector2[i];
        }//fin primer for

        mensaje = "Vector[ " + vector.length + " ]\n"
                + "Vector2[ " + vector2.length + " ]\n"
                + "Sumas de las posiciones:\n" + recorrerVector(sumaV);
    }//fin metodo caclSumaV
}//fin clase SumaVectorial
