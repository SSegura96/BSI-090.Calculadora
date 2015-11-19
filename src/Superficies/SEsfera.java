package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SEsfera extends SFigura
{
    private double radio;

    public SEsfera() 
    {
        radio = 0.0;
        figura = "Esfera";
    }//fin constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public void pedirDatos() 
    {
        todoBien = true;//se limpia la variable
        
        //Se pide la medida del radio y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " del radio:", figura, JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                radio = Double.parseDouble(valor);
                
                if (radio <= 0)
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
    }//fin metodo pedirDatos()
    
    @Override
    public void calcSuperficie() 
    {
        superficie = 4*Math.PI*Math.pow(radio, 2);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Radio: "+radio+"\n"
                + "Superficie: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SEsfera