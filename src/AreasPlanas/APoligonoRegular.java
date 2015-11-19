package AreasPlanas;

import javax.swing.JOptionPane;
import PerimetrosPlanos.*;
import java.text.DecimalFormat;

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
        figura = "PoligonoRegular";
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
    
    
    @Override
    public void pedirDatos() 
    {
        todoBien = true;//se limpia la variable
        
        //Se pide el numero de lados y se validan
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el numero"
                        + " de lados del poligono:", "Poligono Regular", JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                numeroLados = Double.parseDouble(valor);
                
                if (numeroLados <= 0)
                {
                    tituloError = "Aviso";
                    tipoError = 0;
                    imgError = 2;
                    
                    throw new NumberFormatException();
                }//fin segundo if de validacion
                
                todoBien = true;
            }//fin try
            
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                todoBien = false;
            }//fin catch
            
        }while (!todoBien);
        
        //Se pide la medida del lado y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite la medida"
                        + " del lado del poligono:", "Poligono Regular", JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                medidaLado = Double.parseDouble(valor);
                
                if (medidaLado <= 0)
                {
                    tituloError = "Aviso";
                    tipoError = 0;
                    imgError = 2;
                    
                    throw new NumberFormatException();
                }//fin segundo if de validacion
                
                todoBien = true;
            }//fin try
            
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                todoBien = false;
            }//fin catch
            
        }while (!todoBien);
    }//fin metodo pedirDatos
    
    private double calcularApotema()
    {
        double angRadianes;
        double angCentral;
        double apotema;
        //se saca el algulo central y lo convertimos a radianes para poder sacar
        //la tangencia.
        angCentral = 360/numeroLados;
        angRadianes = Math.toRadians(angCentral);
        //Se saca el apotema: Lado/2*tan(angRadianes/2)
        apotema = medidaLado/(2*Math.tan(angRadianes/2));
        
        return apotema;
    }//fin calcularApotema()
    
    
    @Override
    public double calcArea()
    {
        //Se invoca la clase PPoligonoRegular para calcular el perimetro del 
        //poligono y poder usarlo en la formula del area.
        PPoligonoRegular pp = new PPoligonoRegular();
        pp.setNumLados(numeroLados);
        pp.setValorLado(medidaLado);
        pp.calcPerimetro();
        
        area = (pp.getPerimetro()*calcularApotema())/2;
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Tiene: "+numeroLados+" lados \n"
                + "Sus lados miden: "+medidaLado+"\n"
                + "El Area es: "+df.format(area);
    return area;
    }//fin calcularArea()
    
}//fin clase APoligonoRegular
