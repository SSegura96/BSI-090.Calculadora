package Estadistica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Sumatoria extends abEstadistica
{
    
    /**
     * En esste metodo se preguntan los datos y estos se va agregando a un 
     * ArrayList llamado valores
     * @param valores
     * @param area 
     */
    public void pedirDatos (ArrayList <Double> valores,JTextArea area)
    {
        int i = 0;
        boolean seguir = true;
        String mensaje = "";
        
        while (seguir)
        {
            
            double dato = fallo.doubleValidarExcepciones("Digite el valor #"+(i+1));
            
            mensaje += dato+" + ";
            
            area.setText(mensaje);
            
            valores.add(dato);
            
            //menu continuar si no
            int resp = JOptionPane.showOptionDialog(null,
                    "¿Desea registrar otro numero?",
                    "Agregar Numeros", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
            
            if (resp == 1)
            {
                area.setText(mensaje.substring(0, mensaje.length()-2));
                seguir = false;   
            }
            
            i++;
        }
    }
    
    /**
     * Este metodo realiza la sumatoria
     * @param valores
     * @return 
     */
    public double calcularSumatoria (ArrayList <Double> valores)
    {
        double resultado = 0.0;
        
        for (int i = 0; i < valores.size(); i++) 
        {
            resultado += valores.get(i);
        }
        
        return resultado;
    }
    
    
}
