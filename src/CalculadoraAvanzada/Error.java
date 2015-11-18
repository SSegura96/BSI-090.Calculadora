package CalculadoraAvanzada;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Error 
{
    public String seleccionarMensaje (int indice)
    {
        String[] mensajesError = {
        "Numero invalido",
        "Debe digitar un numero  \n igual o mayor que cero",
        "No se aditen numeros \n iguales o menores a cero"};
        
        return mensajesError[indice];
    }
}
