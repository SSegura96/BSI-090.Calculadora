package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SHexaedroRegular extends SFigura
{
    private double lado;
    private double superficieLateral;
    
    public SHexaedroRegular() 
    {
        lado = 0.0;
    }//fin constructor

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public void pedirDatos() 
    {
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado:"));
    }//fin metodo pedirDator()

    @Override
    public void calcSuperficie() 
    {
        superficieLateral = 4*Math.pow(lado, 2);
        
        superficie = 6*Math.pow(lado, 2);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+lado+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SHexaedroRegular