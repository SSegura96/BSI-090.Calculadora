package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SCono extends SFigura
{
    private double generatriz;
    private double radio;
    private double superficieLateral;

    public SCono() 
    {
        generatriz = 0.0;
        radio = 0.0;
        superficieLateral = 0.0;
    }//fin constructor

    public double getGeneratriz() {
        return generatriz;
    }

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getSuperficieLateral() {
        return superficieLateral;
    }

    public void setSuperficieLateral(double superficieLateral) {
        this.superficieLateral = superficieLateral;
    }
    
    
    @Override
    public void pedirDatos() 
    {
        generatriz = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la generatriz:"));
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio:"));
    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() 
    {
        superficieLateral = Math.PI*radio*generatriz;
        
        superficie = Math.PI*radio*(generatriz + radio);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Generatriz: "+generatriz+"\n"
                + "Radio: "+radio+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SCono