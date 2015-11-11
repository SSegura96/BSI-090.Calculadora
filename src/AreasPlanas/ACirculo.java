package AreasPlanas;

import java.text.DecimalFormat;
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
        figura = "Circulo";
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
        area = Math.PI*Math.pow(radio, 2);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "El radio es: "+radio+"\n"
                  +"El area es: "+df.format(area);
    }//fin metodo calcArea ()
    
    
    @Override
    public void pedirDatos()
    {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor del radio:"));
    }//fin clase pedirDatos
    
}//fin clase ACirculo
