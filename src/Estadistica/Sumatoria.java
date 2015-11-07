package Estadistica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Sumatoria 
{
    //ArrayList <Double> valores = new ArrayList();
    
    public void obtenerDatos (ArrayList <Double> valores,JTextArea area)
    {
        int i = 0;
        boolean seguir = true;
        String mensaje = "";
        
        while (seguir)
        {
            
            double dato = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor #"+(i+1)));
            
            mensaje += dato+" + ";
            
            area.setText(mensaje);
            
            valores.add(dato);
            
            
            int resp = JOptionPane.showOptionDialog(null,
                    "¿Desea registrar otro numero?",
                    "Agregar Numeros", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
            
            if (resp == 1)
            {
                seguir = false;
                
            }
            else
            {
                
            }
            
            i++;
        }
    }
    
    public String juntarDatos(ArrayList <Double> valores)
    {
        String listo = "";
        
        for (int i = 0; i < 10; i++) 
        {
            listo += valores.get(i)+" + ";
        }
        
        return listo;
    }
    
    public int calcularSumatoria ()
    {
        int suma = 0;
        
        return suma;
    }
}
