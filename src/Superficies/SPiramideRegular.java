package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SPiramideRegular extends SFigura
{
    private double apotema;
    private double perimBase;
    private double superficieLateral;
    private double areaBase;

    public SPiramideRegular() 
    {
        apotema = 0.0;
        perimBase = 0.0;
        superficieLateral = 0.0;
        areaBase = 0.0;
    }//fin constructor

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getPerimBase() {
        return perimBase;
    }

    public void setPerimBase(double perimBase) {
        this.perimBase = perimBase;
    }

    public double getSuperficieLateral() {
        return superficieLateral;
    }

    public void setSuperficieLateral(double superficieLateral) {
        this.superficieLateral = superficieLateral;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    
    @Override
    public void pedirDatos() 
    {
        apotema = Double.parseDouble(JOptionPane.showInputDialog("Digite el apotema:"));
        perimBase = Double.parseDouble(JOptionPane.showInputDialog("Digite el perimetro de la base:"));
        areaBase = Double.parseDouble(JOptionPane.showInputDialog("Digite el area de la base:"));
    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() 
    {
        superficieLateral = (perimBase * apotema)/2;
        
        superficie = superficieLateral + areaBase;
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Apotema: "+apotema+"\n"
                + "Perimetro de la Base: "+perimBase+"\n"
                + "Area de la la Base:"+areaBase+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
    }//fin metodo calcSuperficie
    
}//fin calse SPiramideRegular