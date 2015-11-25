package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PRombo extends PFigura
{
    protected double valorLado;

    public PRombo()
    {
        valorLado = 0;
        figura = "Rombo";
    }//fin constructor

    public double getValorLado() {
        return valorLado;
    }

    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }
    
    
    @Override
    public void pedirDatos () throws NumberFormatException
    {
        boolean todoBienValorLado = true;
        
        do 
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
                valorLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado:"));
                
                if (valorLado <= 0)
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBienValorLado = true;
                
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBienValorLado = false;
            }
        }while (!todoBienValorLado);

        
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorLado*4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+valorLado+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()
    
}//fin clase PRombo
