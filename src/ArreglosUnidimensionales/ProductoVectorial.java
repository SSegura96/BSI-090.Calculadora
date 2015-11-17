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
        imagenV = "ProductoVectorial";
    }//fin constructor

    public double[] getProductoV() {
        return productoV;
    }

    public void setProductoV(double[] productoV) {
        this.productoV = productoV;
    }
    
   
    @Override
    public void llenarVector() 
    {
        JOptionPane.showMessageDialog(null, "Llenar el primer vector: vector[ ]");
        for (int i = 0; i < vector.length; i++) 
        {
            vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese dato de: vector[" + i + "]"));
        }//fin primer for

        JOptionPane.showMessageDialog(null, "Llenar vector segundo: vector2[ ]");
        for (int j = 0; j < vector2.length; j++) 
        {
            vector2[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato de: vector2[" + j + "]"));
        }//fin segundo for
    }//fin metodo llenarVector()
    
    @Override
    public void pedirDatos()
    {
        tamanno = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del primer vector:"));
        vector = new double[tamanno];
        
        tamanno = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del segundo vector:"));
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