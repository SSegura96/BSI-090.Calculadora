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
    public void pedirDatos() 
    {
        do 
        {
            radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio:"));

            //se valida el valor del radio
            if (radio <= 0) 
            {
                fallo.seleccionarMensaje(0, "Aviso", 2);
            }//fin if

        } while (radio <= 0);
    }//fin clase pedirDatos

    @Override
    public void calcArea() 
    {
        area = Math.PI * Math.pow(radio, 2);
        DecimalFormat df = new DecimalFormat("0.00");

        mensaje = "Radio: " + radio + "\n"
                + "Area: " + df.format(area);
    }//fin metodo calcArea ()

}//fin clase ACirculo
