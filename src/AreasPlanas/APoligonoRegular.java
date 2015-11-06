package AreasPlanas;

import javax.swing.JOptionPane;
import PerimetrosPlanos.PPoligonoRegular;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class APoligonoRegular extends AFigura
{
    private double numeroLados;
    private double medidaLado;
    
    public APoligonoRegular() 
    {
        numeroLados = 0;
        medidaLado = 0;
    }//fin constructor

    public double getNumeroLados() 
    {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) 
    {
        this.numeroLados = numeroLados;
    }

    public double getMedidaLado() 
    {
        return medidaLado;
    }

    public void setMedidaLado(int medidaLado) 
    {
        this.medidaLado = medidaLado;
    }
    
    private double calcularApotema()
    {
        double angRadianes;
        double angCentral;
        double apotema;
        //se saca el algulo central y lo convertimos a radianes para poder sacar la tangencia.
        angCentral = 360/numeroLados;
        angRadianes = Math.toRadians(angCentral);
        //Se saca el apotema: Lado/2*tan(angRadianes/2)
        apotema = medidaLado/(2*Math.tan(angRadianes/2));
        return apotema;
    }//fin calcularApotema()
    
    @Override
    public void calcArea()
    {
        PPoligonoRegular pp = new PPoligonoRegular();
        
        area = (pp.perimetro*calcularApotema())/2;
    }//fin calcularArea()
    
    @Override
    public void pedirDatos()
    {
        numeroLados = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero de lados"));
        
        medidaLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado"));
    }//fin metodo pedirDatos
}//fin clase APoligonoRegular