package Estadistica;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class DesviacionEstandar 
{
    double DesviacionEstandar = 0;
    
    public DesviacionEstandar ()
    {
        DesviacionEstandar = 0;
    }
    
    public double obtenerVarianza ()
    {
        Varianza var = new Varianza();
        Promedio prom = new Promedio();
        prom.setMensaje("Antes de calcular la desviacion estandar es "
                + "\n necesario calcular la varianza \n indrouzca los numeros");
        var.calcVarianza();
        return var.getVarianza();
    }
    
    public void calcDesviacionEstandar()
    {
        double varianza = obtenerVarianza();
        DesviacionEstandar = Math.sqrt(varianza);
    }
    
    public void mostarDatos ()
    {
        JOptionPane.showMessageDialog(null, "La desviacion estandar es: "+DesviacionEstandar);
    }
}
