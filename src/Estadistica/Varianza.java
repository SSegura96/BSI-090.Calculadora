package Estadistica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Sergio Segura Vidal
 */

public class Varianza extends abEstadistica
{
    
    private ArrayList <Double> numeros = new ArrayList<> (); 
    
    private double varianza;

    public Varianza() 
    {
        varianza = 0;
        titulo = "Varianza";
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
    
    public double pedirDatos ()
    {
        Promedio prom = new Promedio ();
        prom.setTitulo("Varianza");
        prom.setMensaje("Digite el primer numero de la \n varianza para comenzar");
        prom.pedirDatos();
        prom.calcPromedio();
        numeros = prom.getValores();
        return prom.getPromedio();
    }
    
    public void calcVarianza ()
    {
        double promedio = pedirDatos();
        
        int i = 0;
        
        while (i < numeros.size())
        {
            varianza += Math.pow((promedio)-numeros.get(i), 2);
            i++;
        }
        
        varianza /= numeros.size();
    }
    
    @Override
    public void mostrarDatos ()
    {
        JOptionPane.showMessageDialog(null, "La varianza es: "+varianza);
    }
}
