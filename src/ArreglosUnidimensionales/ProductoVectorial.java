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
    public void llenarVector() 
    {
        JOptionPane.showMessageDialog(null, "Llenar el primer vector: vector[ ]",
                "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < vector.length; i++) {
            
            todoBien = true;//se limpia la variable

            //Se pide el primer vector
            do {
                try {
                    String valor = JOptionPane.showInputDialog(null,
                            "Ingrese dato de: vector[" + (i+1) + "]", "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);
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
        
        JOptionPane.showMessageDialog(null, "Llenar el segundo vector: vector[ ]",
                "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);
        for (int j = 0; j < vector2.length; j++) {
            
            todoBien = true;//se limpia la variable

            //Se pide el primer vector
            do {
                try {
                    String valor2 = JOptionPane.showInputDialog(null,
                            "Ingrese dato de: vector2[" + (j+1) + "]", "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);
                    if (valor2.equals("") || valor2.equals(" ")) {
                        tituloError = "Error";
                        tipoError = 1;
                        imgError = 0;

                        throw new NumberFormatException();
                    }//fin primer if de validacion

                    vector2[j] = Double.parseDouble(valor2);

                    if (vector2[j] <= 0) 
                    {
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
        }//fin segundo for
        
    }//fin metodo llenarVector()
    
    @Override
    public void pedirDatos()
    {
        todoBien = true;//se limpia la variable

        //Se pide el tamanno del primer vector
        do {
            try {
                String valorV1 = JOptionPane.showInputDialog(null, "Digite el "
                        + "tamaño del primer vector:", "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);
                if (valorV1.equals("") || valorV1.equals(" ")) {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;

                    throw new NumberFormatException();
                }//fin primer if de validacion

                tamanno = Integer.parseInt(valorV1);

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
        
        //Se pide el tamanno del segundo vector
        do {
            try {
                String valorV2 = JOptionPane.showInputDialog(null, "Digite el "
                        + "tamaño del segundo vector:", "Producto Vectorial", JOptionPane.INFORMATION_MESSAGE);
                if (valorV2.equals("") || valorV2.equals(" ")) {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;

                    throw new NumberFormatException();
                }//fin primer if de validacion

                tamanno = Integer.parseInt(valorV2);

                if (tamanno <= 0) 
                {
                    tituloError = "Aviso";
                    tipoError = 0;
                    imgError = 2;

                    throw new NumberFormatException();
                }//fin segundo if de validacion
                
                
                if (tamanno != vector.length-1)
                {
                    
                }//fin tercer if de validacion
                
                todoBien = true;
            }//fin try
            catch (NumberFormatException e) {
                fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                todoBien = false;
            }//fin catch

        } while (!todoBien);
        
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