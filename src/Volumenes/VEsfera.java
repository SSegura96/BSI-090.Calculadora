package Volumenes;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class VEsfera extends VFigura
{
    private double radio;

    public VEsfera () 
    {
        radio = 0;
        figura = "Esfera";
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    
    @Override
    public void pedirDatos ()
    {
        radio = fallo.doubleValidarExcepciones("Digite el valor del radio", figura);
    }
    
    @Override
    public void calcVolumen ()
    {
        volumen = (4/3)*(Math.PI)*(Math.pow(radio, 3));
        
        mensaje = "Radio: "+radio+"\n"
                + "Volumen: "+volumen;
    }
}
