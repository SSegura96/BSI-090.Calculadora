package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SParalelepipedo extends SFigura
{
    private double ancho;
    private double largo;
    private double altura;

    public SParalelepipedo() 
    {
        ancho = 0.0;
        largo = 0.0;
        altura = 0.0;
    }//fin constructor

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    @Override
    public void pedirDatos() 
    {
        ancho = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del ancho:"));
        largo = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del largo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura:"));
        
    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() 
    {
        superficie = 2*(ancho*largo + ancho*altura + largo*altura);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Ancho: "+ancho+"\n"
                + "Largo: "+largo+"\n"
                + "Altura: "+altura+"\n"
                + "Superficie: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SParalelepipedo