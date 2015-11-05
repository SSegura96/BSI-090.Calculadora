package AreasPlanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ACirculo extends AFigura
{
    private double radio;

    public ACirculo()
    {
        radio = 0;
    }//fin constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcArea ()
    {
        setArea(Math.PI*Math.pow(radio, 2));
    }//fin metodo calcArea ()
    
    
    @Override
    public void pedirDatos()
    {
        setRadio(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor del radio")));
    }//fin clase pedirDatos
    
}//fin clase ACirculo
