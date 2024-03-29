package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ProductoVectorial extends ArregloUnidimensional {

    private double[] productoV;

    public ProductoVectorial() {
        productoV = new double[0];
    }//fin constructor

    public double[] getProductoV() {
        return productoV;
    }

    public void setProductoV(double[] productoV) {
        this.productoV = productoV;
    }

    @Override
    public void llenarVector() {

        //Se llena el primer vector
        JOptionPane.showMessageDialog(null, "Llenar el primer vector: vector[ ]",
                "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < vector.length; i++) {
            vector[i] = fallo.doubleValidarExcepciones("Ingrese dato de: "
                    + "vector[" + (i) + "]", "Producto Vectorial");
        }//fin primer for

        //Se llena el segundo vector
        JOptionPane.showMessageDialog(null, "Llenar el segundo vector: vector2[ ]",
                "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);

        for (int j = 0; j < vector2.length; j++) {
            vector2[j] = fallo.doubleValidarExcepciones("Ingrese dato de: "
                    + "vector2[" + (j) + "]", "Producto Vectorial");
        }//fin segundo for

    }//fin metodo llenarVector()

    @Override
    public void pedirDatos() {

        //Se pide el tamaño del primer vector
        tamanno = fallo.doubleValidarExcepciones("Digite el tamaño del primer vector:", "Producto Vectorial");

        vector = new double[(int) tamanno];

        tamanno = fallo.doubleValidarExcepciones("Digite el tamaño del segundo vector:",
                "Producto Vectorial");

        //Se pide el tamanno del segundo vector
        while (tamanno != vector.length) {
            //Exepcion creada por motivos externos y validar que ambos vectores sean del mismo tamaño
            if (tamanno != vector.length) {

                JOptionPane.showMessageDialog(null, "Los vectores tienen que ser del "
                        + "mismo tamaño.", "Aviso", JOptionPane.WARNING_MESSAGE);

                tamanno = fallo.doubleValidarExcepciones("Digite el tamaño del segundo vector:",
                        "Producto Vectorial");
            }//fin if de validacion
        }//fin while
        vector2 = new double[(int) tamanno];
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
        productoV = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            productoV[i] = vector[i] * vector2[i];
        }//fin primer for

        mensaje = "Vector[ " + vector.length + " ]\n"
                + "Vector2[ " + vector2.length + " ]\n "
                + "Productos de las posiciones:\n" + recorrerVector(productoV);
    }//fin metodo caclProductoV

}//fin clase ProductoVectorial
