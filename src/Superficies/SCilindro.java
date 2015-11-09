package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SCilindro extends SFigura
{
    private double altura;
    private double radio;

    public SCilindro() 
    {
        altura = 0.0;
        radio = 0.0;
    }//fin constructor

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void pedirDatos() 
    {
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la atura:"));
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio:"));
    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() 
    {
        superficie = 2*Math.PI*radio*(altura + radio);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Altura: "+altura+"\n"
                + "Radio: "+radio+"\n"
                + "Superficie: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SCilindro