package Estadistica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Sergio Segura Vidal
 */

public class Varianza 
{
    
    private ArrayList <Double> numeros = new ArrayList (); 
    
    private double varianza;

    public Varianza() 
    {
        varianza = 0;
    }

    public ArrayList<Double> getNumeros() 
    {
        return numeros;
    }

    public void setNumeros(ArrayList<Double> numeros) 
    {
        this.numeros = numeros;
    }

    public double getVarianza() 
    {
        return varianza;
    }

    public void setVarianza(double varianza) 
    {
        this.varianza = varianza;
    }
    
    public double obtenerPromedio ()
    {
        Promedio prom = new Promedio ();
        prom.setMensaje("Digite el primer numero de la \n varianza para comenzar");
        prom.pedirDatos();
        prom.calcPromedio();
        numeros = prom.getValores();
        return prom.getPromedio();
    }
    
    public void calcVarianza ()
    {
        double promedio = obtenerPromedio();
        
        int i = 0;
        
        while (i < numeros.size())
        {
            varianza += Math.pow((promedio)-numeros.get(i), 2);
            i++;
        }
        
        varianza /= numeros.size();
    }
    
    public void mostrarDatos ()
    {
        JOptionPane.showMessageDialog(null, "La varianza es: "+varianza);
    }
}
