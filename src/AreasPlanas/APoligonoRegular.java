package AreasPlanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import PerimetrosPlanos.PPoligonoRegular;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class APoligonoRegular extends AFigura
{
    private int numeroLados;
    private int medidaLado;
    
    public APoligonoRegular() 
    {
        this.numeroLados = 0;
        this.medidaLado = 0;
    }//fin constructor

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getMedidaLado() {
        return medidaLado;
    }

    public void setMedidaLado(int medidaLado) {
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
        //area = (perimetro*calcularApotema())/2;
    }//fin calcularArea()
    
    @Override
    public void cargarImagen()
    {
        JOptionPane.showMessageDialog(null,"", "Poligono Regular", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon("RUTA DE LA IMAGEN"));
    }//fin metodo cargarImagen
}//fin clase APoligonoRegular