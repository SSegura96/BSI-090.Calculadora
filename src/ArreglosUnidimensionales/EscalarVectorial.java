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
            
            vector[i] = fallo.doubleValidarExcepciones("Ingrese dato de: "
                    + "vector[" + (i + 1) + "]", "Escalar vectorial");
        }//fin primer for
    }//fin metodo llenarVector()

    @Override
    public void pedirDatos() {

        tamanno = fallo.doubleValidarExcepciones("Digite el tamaño del vector:", "Escalar Vectorial");

        vector = new double[ (int) tamanno];

        //Se pide el escalar
        escalar = fallo.doubleValidarExcepciones("Digite el escalar:", "Escalar Vectorial");

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
