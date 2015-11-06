package AreasPlanas;

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
    public void calcArea ()
    {
        setArea((diagMayor*diagMenor)/2);
        
        mensaje = "La diagonal mayor es: "+diagMayor+"\n"
                + "La diagonal menor es: "+diagMenor+"\n"
                + "El Area es: "+area;
        
    }//fin metodo calcArea ()

    @Override
    public void pedirDatos()
    {
        setDiagMayor(Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la diagonal mayor")));
               
        setDiagMenor(Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la diagonal menor")));
    }//fin clase pedirDatos
    
}//fin clase ARombo
