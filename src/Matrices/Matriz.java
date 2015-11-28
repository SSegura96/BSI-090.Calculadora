/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Matriz 
{
    
    ManejoErrores fallo = new ManejoErrores();
    
    private double escalar;
    private String imagen;
    public double[][] matrizA;
    public double[][] matrizB;
    public double[][] matrizT;
    
    public Matriz ()
    {
        escalar = 0;
        imagen = "Matriz";
    }
    
    public void inicializarMatrices (int tipo)
    {
        escogerTamanno mA = new escogerTamanno(new javax.swing.JFrame(), true);
        escogerTamanno mB = new escogerTamanno (new javax.swing.JFrame(), true);
        
        mA.setNombreMatriz("A");
        mA.setVisible(true);
        matrizA = new double [mA.numFilas][mA.numColumnas];
        
        matrizT = new double [mA.numFilas][mA.numColumnas];
        
        if (tipo == 1)
        {
            mB.setNombreMatriz("B");
            mB.setVisible(true);
            matrizB = new double [mB.numFilas][mB.numColumnas];
        }
    }
    
    public void pedirDatos (int tipo)
    {
        if (tipo == 0)
        {
            escalar = fallo.doubleValidarExcepciones("Digite el valor del escalar", imagen);
            
            llenarMatriz(matrizA);
            mostrarMatriz(matrizA, "Los datos son:");
        }
        else
        {  
            llenarMatriz(matrizA);
            mostrarMatriz(matrizA, "Los datos de la matriz A son:");
            
            llenarMatriz(matrizB);
            mostrarMatriz(matrizB, "Los datos de la matriz B son:");
        }
    }
    
    public void llenarMatriz (double[][] m)
    {   
        for (int fila = 0;fila<m.length;fila++)
        {
            for (int columna = 0;columna<m[fila].length;columna++)
            {
                m[fila][columna] = fallo.doubleValidarExcepciones("digite el numero de la posicion ["+fila+"]["+columna+"]", imagen);
            }
        }
    }
    
    public void productoEscalar ()
    {
        for (int fila = 0; fila < matrizA.length; fila++) 
        {
            for (int columna = 0; columna < matrizA[fila].length; columna++) 
            {
                matrizT [fila][columna] = matrizA[fila][columna] * escalar;
            }
        }
        
        mostrarMatriz(matrizT, "El resultado de multiplicar \n"+escalar+" por la matriz A es:");
    }
    
    public void sumarMatrices ()
    {
       if (matrizA.length == matrizB[0].length)
        {
            for (int fila = 0; fila < matrizA.length; fila++) 
            {
                for (int columna = 0; columna < matrizA[fila].length; columna++) 
                {
                    matrizT[fila][columna] = matrizA[fila][columna] + matrizB[fila][columna];
                }
            }
            mostrarMatriz(matrizT, "El resultado es:");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "No se puede realizar la suma \n "
                                                + "ya que los tamaños no son iguales");
        }
    }

    public void productoMatrices ()
    {
       if (matrizA.length == matrizB[0].length)
        {
            for (int fila=0; fila < matrizT.length; fila++) 
            {
                for (int columna=0; columna < matrizT[fila].length; columna++) 
                {
                  for (int i=0; i<matrizA.length; i++) 
                  {
                    matrizT[fila][columna] += matrizA[fila][i]*matrizB[i][columna]; 
                  }
                }
            } 
            mostrarMatriz(matrizT, "El resultado es:");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "No se puede realizar la multiplicacion \n "
                                                + "ya que los tamaños no son iguales");
        }
    }
    
    public void mostrarMatriz(double[][] m ,String mensaje)
    {
       
        String listo = "|";
       
        for (int fila = 0; fila < m.length; fila++) 
        {
            for (int columna = 0; columna < m[fila].length; columna++) 
            {
                listo += m[fila][columna]+"|";
            }
            
            listo +="\n|";
        }
        JOptionPane.showMessageDialog(null, mensaje+"\n"+listo.substring(0, (listo.length()-1)));
    }
    
}
