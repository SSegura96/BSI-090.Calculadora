package Estadistica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Promedio 
{
    ArrayList <Double> valores = new ArrayList ();
    
    private double promedio = 0.0;
    private  String mensaje;
    
    public Promedio() 
    {
        promedio = 0;
        mensaje = "Se va  calcular el promedio digite el "
                + "\n primer numero para continuar";
    }

    public ArrayList<Double> getValores() 
    {
        return valores;
    }
    
    public double getPromedio() 
    {
        return promedio;
    }

    public void setPromedio(double promedio) 
    {
        this.promedio = promedio;
    }

    public String getMensaje() 
    {
        return mensaje;
    }

    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }
    
    public void pedirDatos ()
    {
        boolean seguir = true;
        int i = 2;
        
        while (seguir)
        {
            valores.add(Double.parseDouble(JOptionPane.showInputDialog(mensaje,
            "Digite un número entero positivo")));
            mensaje =  "Digite el "+i+"º número";
            i++;
            
            if (1==JOptionPane.showOptionDialog(null,
                    "¿Desea agregar otro numero?",
                    null, JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, null, null))
            {
               seguir = false; 
            }
        }
    }
    
    public void calcPromedio ()
    {
        double suma = 0; 
        
        for (int i = 0;i<valores.size();i++)
        {
            double elemento;
            
            elemento = valores.get(i);
            System.out.println(elemento);
            suma+= elemento;
        }
        
        promedio = suma/valores.size();
        System.out.println(promedio);
    }
    
    public void mostarDatos ()
    {
        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
    }
}