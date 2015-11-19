package CalculadoraAvanzada;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

/*
 * Logo :
 * 
 *      0: Logo de "Error" 
 *      2: Logo de "Warning"
 * 
 * Indice :
 *
 *      n: tira un mensaje difente segun el indice.
 * 
 */

public class ManejoErrores 
{
    //Indice = mensaje en el vector, titulo = titulo de la ventana, logo = Error o Warning descrito arriba.
    public void seleccionarMensaje (int indice,String titulo, int logo)
    {
        String[] mensajesError = {
        "El valor no puede ser 0 o un numero negativo.",
        "Usted no digito valores."};
        
        JOptionPane.showMessageDialog(null, mensajesError[indice],titulo,logo);
    }
}


