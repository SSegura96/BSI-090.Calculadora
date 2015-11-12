/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Matriz 
{
    private double escalar;
    
    double[][] matrizA;
    double[][] matrizB;
    double[][] matrizT;
    
    public void inicializarMatrices (int tipo)
    {
        escogerTamanno et = new escogerTamanno ();
        et.setVisible(true);
        matrizA = new double [et.numFilas][et.numColumnas];
        
        
        if (tipo == 1)
        {
            escogerTamanno es = new escogerTamanno ();
            es.setVisible(true);
            matrizB = new double [es.numFilas][es.numColumnas];

            matrizT = new double [et.numFilas][et.numColumnas];
        }
    }
    
    public void llenarMatriz (double[][] m)
    {
        for (int fila = 0;fila<m.length;fila++)
        {
            for (int columna = 0;columna<m[fila].length;columna++)
            {
                m[fila][columna] = Double.parseDouble(JOptionPane.showInputDialog("digite el numero de la posicion ["+fila+"]["+columna+"]"));
            }
        }
    }
    
    public void pedirDatos (int tipo)
    {
        if (tipo == 0)
        {
            escalar = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del escalar"));
            
            llenarMatriz(matrizA);
        }
        else
        {  
            llenarMatriz(matrizA);
            llenarMatriz(matrizB);
        }
    }
    
    public void sumarEscalar ()
    {
        for (int fila = 0; fila < matrizA.length; fila++) 
        {
            for (int columna = 0; columna < matrizA[fila].length; columna++) 
            {
                matrizA[fila][columna] += escalar;
            }
        }
    }
    
    public void sumarMatrices ()
    {
       if (matrizA.length == matrizB[0].length)
        {
            for (int fila = 0; fila < matrizA.length; fila++) 
            {
                for (int columna = 0; columna < matrizA[fila].length; columna++) 
                {
                    matrizT[fila][columna] = matrizA[fila][columna] + matrizB[columna][fila];
                }
            } 
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "No se puede realizar la multiplicacion \n "
                                                + "ya que los tamaños no son iguales");
        }
    }

    public void productoMatrices ()
    {
       if (matrizA.length == matrizB[0].length)
        {
            for (int fila = 0; fila < matrizA.length; fila++) 
            {
                for (int columna = 0; columna < matrizA[fila].length; columna++) 
                {
                    matrizT[fila][columna] = matrizA[fila][columna] + matrizB[columna][fila];
                }
            } 
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "No se puede realizar la multiplicacion \n "
                                                + "ya que los tamaños no son iguales");
        }
    }
    
    public void mostrarResultado()
    {
       
        String listo = "|";
       
        for (int fila = 0; fila < matrizT.length; fila++) 
        {
            for (int columna = 0; columna < matrizT[fila].length; columna++) 
            {
                listo += matrizT[fila][columna]+"|";
            }
            
            listo +="\n";
        }
        
        JOptionPane.showMessageDialog(null, listo);
    }
    
}
