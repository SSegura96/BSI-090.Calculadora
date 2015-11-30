package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ProductoVectorial extends ArregloUnidimensional
{
    private double []productoV;

    public ProductoVectorial() 
    {
        productoV = new double [0];
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

            String valor = JOptionPane.showInputDialog(null,
                    "Ingrese dato de: vector[" + (i + 1) + "]", "Producto Vectorial", 
                    JOptionPane.INFORMATION_MESSAGE);

            vector[i] = fallo.doubleValidarExcepciones(valor, "Producto Vectorial");
        }//fin primer for
        
        //Se llena el segundo vector
        JOptionPane.showMessageDialog(null, "Llenar el segundo vector: vector2[ ]",
                "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);
        
        for (int j = 0; j < vector2.length; j++) {

            String valor2 = JOptionPane.showInputDialog(null,
                    "Ingrese dato de: vector2[" + (j + 1) + "]", "Producto Vectorial", 
                    JOptionPane.INFORMATION_MESSAGE);

            vector2[j] = fallo.doubleValidarExcepciones(valor2, "Producto Vectorial");
        }//fin segundo for
        
    }//fin metodo llenarVector()
    
    @Override
    public void pedirDatos() {
        
        //Se pide el tamaño del primer vector
        tamanno = fallo.intValidarExcepciones("Digite el tamaño del primer vector:", "Producto Vectorial");

        vector = new double[tamanno];

        //Se pide el tamanno del segundo vector
        do {
            
            tamanno = fallo.intValidarExcepciones("Digite el tamaño del vector:", 
                    "Producto Vectorial");
            
            //Exepcion creada por motivos externos y validar que ambos vectores sean del mismo tamaño
            if (tamanno != vector.length) {
                JOptionPane.showMessageDialog(null, "Los vectores tienen que ser del "
                        + "mismo tamaño.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }//fin if de validacion
            
        } while (tamanno != vector.length);
        
        vector2 = new double[tamanno];
        
        llenarVector();
    }//fin metodo pedirDatos()
    
    @Override
    public String recorrerVector(double[] vector1)
    {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) 
        {
            dato += ""+vector1[i]+", ";
        }//foin primer for
        
        dato = dato.substring(0, dato.length()-2);
        return dato;
        
    }//fin metodo recorrerVector
    
    public void calcProductoV()
    {
        productoV = new double[vector.length];
        for (int i = 0; i < vector.length; i++) 
        {
            productoV[i] = vector[i]*vector2[i];
        }//fin primer for
        
        mensaje = "Vector[ "+vector.length+" ]\n"
                + "Vector2[ "+vector2.length+" ]\n "
                + "Productos de las posiciones:\n"+recorrerVector(productoV);
    }//fin metodo caclProductoV
    
}//fin clase ProductoVectorial