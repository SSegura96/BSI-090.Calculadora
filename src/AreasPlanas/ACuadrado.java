package AreasPlanas;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ACuadrado extends AFigura
{
    private double valorLado;

    public ACuadrado() 
    {
       valorLado = 0;
       figura = "Cuadrado";
    }//fin constructor

    public double getValorLado() 
    {
        return valorLado;
    }

    public void setValorLado(double valorLado) 
    {
        this.valorLado = valorLado;
    }
    
    
    @Override
    public void pedirDatos() 
    {
        todoBien = true;//se limpia la variable
        
        //Se pide el valor del lado y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " del lado:", figura, JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                valorLado = Double.parseDouble(valor);
                
                if (valorLado <= 0)
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

    }//fin clase pedirDatos
    
    @Override
    public double calcArea ()
    {
        area = valorLado * valorLado;
        
        mensaje = "Lado: "+valorLado+"\n"
                + "Area: "+decimalFomrat.format(area);
    return area;
    }//fin calcArea ()
    
}//fin clase ACuadrado
