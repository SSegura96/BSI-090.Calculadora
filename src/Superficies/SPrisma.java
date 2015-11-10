package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SPrisma extends SFigura
{
    private double altura;
    private double numLadosBase;
    private double valorLado;
    private double perimBase;
    private double areaBase;
    private double superficieLateral;
    
    public SPrisma() 
    {
        altura = 0.0;
        numLadosBase = 0.0;
        valorLado = 0.0;
        perimBase = 0.0;
        areaBase = 0.0;
        superficieLateral = 0.0;
    }//fin constructor

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getNumLadosBase() {
        return numLadosBase;
    }

    public void setNumLadosBase(double numLadosBase) {
        this.numLadosBase = numLadosBase;
    }

    public double getValorLado() {
        return valorLado;
    }

    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }

    public double getPerimBase() {
        return perimBase;
    }

    public void setPerimBase(double perimBase) {
        this.perimBase = perimBase;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
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
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura:"));
        valorLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado:"));
        numLadosBase = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero de lados de la base:"));
    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() 
    {
        //DESPICHE AL CALCULAR EL AREA DE LA BASE
        
        /**
        perimBase = numLadosBase * valorLado;
        
        superficieLateral = perimBase*altura;
        
        superficie = superficieLateral+(2*areaBase);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Altura: "+altura+"\n"
                + "Perimetro de la Base: "+perimBase+"\n"
                + "Area de la Base: "+areaBase+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
        */
    }//fin metodo calcSuperficie()
    
}//fin clase SPrisma