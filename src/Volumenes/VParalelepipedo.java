package Volumenes;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class VParalelepipedo extends VFigura
{
    private double largo;
    private double ancho;
    private double altura;

    public VParalelepipedo () 
    {
        largo = 0;
        ancho = 0;
        altura = 0;
        figura = "Paralelepipedo";
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public void pedirDatos ()
    {
        largo = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del largo"));
        ancho = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del ancho"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura"));
    }
    
    @Override
    public void calcVolumen ()
    {
        volumen = largo*ancho*altura;
        
        mensaje = "Lado: "+largo+"\n"
                + "Ancho: "+ancho+"\n"
                + "Altura: "+altura
                + "Volumen "+volumen;
    }

}
