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
    
    private String tituloError = "";
    int tipoError = 1;
    int imgError = 2;
    
    //Indice = mensaje en el vector, titulo = titulo de la ventana, logo = Error o Warning descrito arriba.
    public void seleccionarMensaje (int indice, String titulo, int logo)
    {
        String[] mensajesError = 
        {
        "El valor no puede ser 0 o un numero negativo.",
        "No se digitaron valores validos.",
        "Digite solo numeros primos.",//Solo Gilbreath
        "Solo se pueden digitar numeros enteros en el intervalo de 2 a 10."//Solo Gilbreath
        };
        
        JOptionPane.showMessageDialog(null, mensajesError[indice],titulo,logo);
    }
    
    /**
     * Este metodo muestra un mensaje en caso de que lo digtado se menor que cero
     * o no sea un numero el se encicla y vuelve a mostar el mensaje hasta que el
     * valor sea correcto
     */
    public double doubleValidarExcepciones (double valor, String mensaje) throws NumberFormatException 
    {
        boolean todoBien = true; 
        
        do
        {
            try
            {
                valor = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                
                if (valor <= 0)
                {
                    tituloError = "Advertencia";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBien = true;
            }
            catch (NumberFormatException e)
            {
                todoBien = false;
                seleccionarMensaje(tipoError, tituloError, imgError);
            }
            
        }while (!todoBien);
        
        return valor;
    }
    
    public double intValidarExcepciones (int valor, String mensaje) throws NumberFormatException 
    {
        boolean todoBien = true; 
        
        do
        {
            try
            {
                valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                
                if (valor <= 0)
                {
                    tituloError = "Advertencia";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException e)
            {
                todoBien = false;
                seleccionarMensaje(tipoError, tituloError, imgError);
            }
            
        }while (todoBien);
        
        return valor;
    }
}


