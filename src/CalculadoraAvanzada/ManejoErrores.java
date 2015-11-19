package CalculadoraAvanzada;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

/*
 * Logo :
 * 
 * 0: Logo de Error 
 * 1: Logo de Warning
 * 
 * Indice :
 *
 * n: tira un mensaje difente segun el indice.
 * 
 */

public class ManejoErrores 
{
    public void seleccionarMensaje (int indice,String titulo, int logo)
    {
        String[] mensajesError = {
        "Numero invalido",
        "Debe digitar un numero  \n igual o mayor que cero",
        "No se aditen numeros \n iguales o menores a 0",
        "El valor no puede ser 0 o un numero negativo"};
        
        JOptionPane.showMessageDialog(null, mensajesError[indice],titulo,logo);
    }
}


