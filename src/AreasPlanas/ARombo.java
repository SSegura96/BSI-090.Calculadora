package AreasPlanas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ARombo extends AFigura 
{
    private double diagMayor;
    private double diagMenor;

    public ARombo() 
    {
        diagMayor = 0;
        diagMenor = 0;
        figura = "Rombo";
    }//fin constructor
    
    public double getDiagMayor() 
    {
        return diagMayor;
    }

    public void setDiagMayor(double diagMayor) 
    {
        this.diagMayor = diagMayor;
    }

    public double getDiagMenor() 
    {
        return diagMenor;
    }

    public void setDiagMenor(double diagMenor) 
    {
        this.diagMenor = diagMenor;
    }
    
    
    @Override
    public void pedirDatos() 
    {
        do 
        {
            diagMayor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la diagonal mayor:"));

            if (diagMayor <= 0) 
            {
                fallo.seleccionarMensaje(0, "Aviso", 2);
            }//fin primer if de validacion

            diagMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la diagonal menor:"));

            if (diagMenor <= 0) 
            {
                fallo.seleccionarMensaje(0, "Aviso", 2);
            }//fin segundo if de validacion

        } while (diagMayor <= 0 || diagMenor <= 0);

    }//fin clase pedirDatos
    
    @Override
    public double calcArea ()
    {
        area = (diagMayor*diagMenor)/2;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Diagonal Mayor: "+diagMayor+"\n"
                + "Diagonal Menor: "+diagMenor+"\n"
                + "Area: "+df.format(area);
        
    return area;
    }//fin metodo calcArea ()
    
}//fin clase ARombo
