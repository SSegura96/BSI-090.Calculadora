package AreasPlanas;

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
    public void calcArea() 
    {
        //variable para guardar el valor del area
        double a;
        a = ((Math.sqrt(3))*Math.pow(medidaLado, 2))/4;
    }//fin metodo calcArea()
    
    @Override
    public void pedirDatos()
    {
        medidaLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado"));
    }//fin clase pedirDatos
}//fin clase ATriangulo