package Volumenes;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class VPiramide extends VFigura
{
    private double altura;
    private double areaBase;

    public VPiramide()
    {
        altura = 0;
        areaBase = 0;
        figura = "Piramide";
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }
    
    @Override
    public void pedirDatos ()
    {
       altura = fallo.doubleValidarExcepciones("Digite el valor de la altura", figura);
    }
    
    @Override
    public void calcVolumen ()
    {
        Escoger e  = new Escoger ();
        
        e.setVisible(true);
        areaBase = e.areaBase;
        volumen =  (areaBase * altura)/3;
        
        mensaje = "Altura: "+altura+"\n"
                + "Area Base: "+areaBase+"\n"
                + "Volumen: "+volumen;
    }
}
