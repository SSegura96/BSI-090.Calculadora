package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SCono extends SFigura
{
    private double altura;
    private double radio;
    private double generatriz;
    private double superficieLateral;

    public SCono() 
    {
        altura = 0.0;
        radio = 0.0;
        superficieLateral = 0.0;
        generatriz = 0.0;
        figura = "Cono";
    }//fin constructor

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getGeneratriz() {
        return generatriz;
    }

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }

    public double getSuperficieLateral() {
        return superficieLateral;
    }

    public void setSuperficieLateral(double superficieLateral) {
        this.superficieLateral = superficieLateral;
    }
    
    
    @Override
    public void pedirDatos() 
    {
        todoBien = true;//se limpia la variable
        
        //Se pide la altura y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " de la altura:", figura, JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                altura = Double.parseDouble(valor);
                
                if (altura <= 0)
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
        superficieLateral = Math.PI*radio*altura;
        
        superficie = Math.PI*radio*(altura + radio);
        
        generatriz = Math.pow(altura, 2) + Math.pow(radio, 2);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Altura: "+altura+"\n"
                + "Radio: "+radio+"\n"
                + "Generatriz: "+df.format(generatriz)+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SCono