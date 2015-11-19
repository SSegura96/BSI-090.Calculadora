package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PPoligonoRegular extends PFigura
{
    protected double numLados;
    protected double valorLado;

    public PPoligonoRegular()
    {
        numLados = 0;
        valorLado = 0;
    }//fin constructor

    public double getNumLados() 
    {
        return numLados;
    }
    
    public void setNumLados(double numLados) 
    {
        this.numLados = numLados;
    }

    public double getValorLado() 
    {
        return valorLado;
    }

    public void setValorLado(double valorLado) 
    {
        this.valorLado = valorLado;
    }
    
    
    @Override
    public void pedirDatos() throws NumberFormatException
    {
        boolean todoBienNumLados = true;
        boolean todoBienValorLado = true;
        String titulo = "";
        int tipoError = 0;
        int imgError = 0;
        
        do 
        {
            try
            {
                String valor = JOptionPane.showInputDialog("Digite el numero de lados:");
                
                if (valor.equals("") || valor.equals(" "))
                {
                    titulo = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                numLados = Double.parseDouble(valor);
                
                if (numLados <= 0)
                {
                    titulo = "Aviso";
                    tipoError = 1;
                    imgError = 2;
                    throw new NumberFormatException();
                }
                
                todoBienNumLados = true;
                
            }
            catch (NumberFormatException e)
            {
                todoBienNumLados = false;
                fallo.seleccionarMensaje(tipoError, titulo, imgError);
            }
        }while (!todoBienNumLados);
        
        do
        {
            try
            {
            
                String valor = JOptionPane.showInputDialog("Digite el valor del lado:");

                if (valor.equals("") || valor.equals(" "))
                {
                    titulo = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                } 

                valorLado = Double.parseDouble(valor);

                if (valorLado <= 0)
                {
                    titulo = "aviso";
                    tipoError = 1;
                    imgError = 2;
                    throw new NumberFormatException();
                }
                
                todoBienValorLado = true;
                
            }catch (NumberFormatException e)
            {
                todoBienValorLado = false;
                fallo.seleccionarMensaje(tipoError, titulo, imgError);
            }
        }while(!todoBienValorLado);
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro()
    {
        perimetro = numLados * valorLado;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Numero de lados: "+numLados+"\n"
                + "Medida del lado: "+valorLado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()
    
}//fin clase PPoligonoRegular
