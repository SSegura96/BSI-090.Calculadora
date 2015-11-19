package CalculadoraAvanzada;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

/*
 * Logo :
 * 
 *      0: Logo de "Error" 
 *      1: Logo de "Warning"
 * 
 * Indice :
 *
 *      n: tira un mensaje difente segun el indice.
 * 
 */

public class ManejoErrores 
{
    public void seleccionarMensaje (int indice,String titulo, int logo)
    {
        String[] mensajesError = {
        "El valor no puede ser 0 o un numero negativo"};
        
        JOptionPane.showMessageDialog(null, mensajesError[indice],titulo,logo);
    }
}


