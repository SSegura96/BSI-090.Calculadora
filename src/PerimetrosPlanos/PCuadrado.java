package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PCuadrado extends PFigura 
{
    protected double valorLado;

    public PCuadrado()
    {
        valorLado = 0;
        figura = "Cuadrado";
    }//fin constructor

    public double getValorlado() {
        return valorLado;
    }

    public void setValorlado(double valorlado) {
        this.valorLado = valorlado;
    }
    
    @Override
    public void pedirDatos () throws NumberFormatException
    {
        boolean todoBienLado = true;
        
        do
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
                String valor = JOptionPane.showInputDialog("Digite el valor del lado:");
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }
                
                valorLado = Double.parseDouble(valor);
                
                if (valorLado <= 0)
                {
                    tituloError = "Aviso";
                    tipoError = 0;
                    imgError = 1;
                    throw new NumberFormatException();
                }
                
                todoBienLado = true;
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                todoBienLado = false;
            }
        }while (!todoBienLado);
                
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorLado*4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+valorLado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro ()
    
}//fin clase PCuadrado
