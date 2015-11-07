package AreasPlanas;

import javax.swing.JOptionPane;
import PerimetrosPlanos.*;

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
        numeroLados = 0.0;
        medidaLado = 0.0;
    }//fin constructor

    public double getNumeroLados() 
    {
        return numeroLados;
    }

    public void setNumeroLados(double numeroLados) 
    {
        this.numeroLados = numeroLados;
    }

    public double getMedidaLado() 
    {
        return medidaLado;
    }

    public void setMedidaLado(double medidaLado) 
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
        //Se invoca la clase PPoligonoRegular para calcular el area del poligono y poder usarlo en la formula del area
        PPoligonoRegular pp = new PPoligonoRegular();
        pp.setNumlados(numeroLados);
        pp.setValorlado(medidaLado);
        pp.calcPerimetro();
        
        area = (pp.perimetro*calcularApotema())/2;
        
        mensaje = "Tiene: "+numeroLados+" lados \n"
                + "Sus lados miden: "+medidaLado+"\n"
                + "El Area es: "+area;
    }//fin calcularArea()
    
    @Override
    public void pedirDatos()
    {
        setNumeroLados(Double.parseDouble(JOptionPane.showInputDialog("Digite el numero de lados:")));
        
        setMedidaLado(Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado:")));
    }//fin metodo pedirDatos
}//fin clase APoligonoRegular