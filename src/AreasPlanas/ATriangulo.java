package AreasPlanas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ATriangulo extends AFigura
{
    private double medidaLado;

    public ATriangulo() 
    {
        this.medidaLado = 0.0;
    }

    public double getMedidaLado() 
    {
        return medidaLado;
    }

    public void setMedidaLado(double medidaLado) 
    {
        this.medidaLado = medidaLado;
    }
    
    @Override
    public void pedirDatos()
    {
        medidaLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado:"));
    }//fin clase pedirDatos@Override
    
    @Override
    public void calcArea() 
    {
        area = ((Math.sqrt(3))*Math.pow(medidaLado, 2))/4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "La media del lado es: "+medidaLado+"\n"
                + "El area es: "+df.format(area);
    }//fin metodo calcArea()
    
}//fin clase ATriangulo