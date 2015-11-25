package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PCirculo extends PFigura
{
    protected double radio;

    public PCirculo()
    {
        radio = 0;
        figura = "Circulo";
    }//fin constructor

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    
    
    @Override
    public void pedirDatos () throws NumberFormatException
    {
        boolean todoBienRadio = true;
        
        do
        {
            try
            {
                String valor  = JOptionPane.showInputDialog("Digite el radio:");
                
                if (valor.equals("") || valor.equals(" "))
                {
                   tituloError = "Error";
                   imgError = 0;
                   tipoError = 1;
                   throw new NumberFormatException();
                }//fin primer if de validacion
                
                radio = Double.parseDouble(valor);
                
                if (radio <= 0)
                {
                    tituloError = "Aviso";
                    imgError = 2;
                    tipoError = 0;
                    throw new NumberFormatException();
                }//fin segundo if de validacion
                
                todoBienRadio = true;
            }//fin try
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, tituloError, imgError);
                todoBienRadio = false;
            }//fin catch
    
         }while (!todoBienRadio);
        
    }//fin metodo pedirDatos ()
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = (2*Math.PI)*radio;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Radio: "+radio+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro ()

}//fin clase PCirculo
