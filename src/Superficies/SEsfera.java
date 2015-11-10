package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SEsfera extends SFigura
{
    private double radio;

    public SEsfera() 
    {
        radio = 0.0;
    }//fin constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public void pedirDatos() 
    {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
    }//fin metodo pedirDatos()
    
    @Override
    public void calcSuperficie() 
    {
        superficie = 4*Math.PI*Math.pow(radio, 2);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Radio: "+radio+"\n"
                + "Superficie: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SEsfera