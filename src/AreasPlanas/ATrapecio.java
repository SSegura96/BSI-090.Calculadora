package AreasPlanas;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ATrapecio extends AFigura
{
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public ATrapecio() 
    {
        baseMayor = 0.0;
        baseMenor = 0.0;
        altura = 0.0;
        figura = "Trapecio";
    }

    public double getBaseMayor() 
    {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) 
    {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() 
    {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) 
    {
        this.baseMenor = baseMenor;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
    
    @Override
    public void pedirDatos() 
    {
        todoBien = true;//se limpia la variable
        
        //Se pide el valor de la base mayor y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " de la Base Mayor:", figura, JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                baseMayor = Double.parseDouble(valor);
                
                if (baseMayor <= 0)
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
        
        //Se pide el valor de base menor y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " de la Base Menor:", figura, JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                baseMenor = Double.parseDouble(valor);
                
                if (baseMenor <= 0)
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
        
        //Se pide el valor de altura y se valida
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
    }//fin metodo pedirDatos()
    
    @Override
    public double calcArea() 
    {
        area = ((baseMayor + baseMenor)*altura)/2;
        
        mensaje = "Base Mayor: "+baseMayor+"\n"
                + "Base Menor: "+baseMenor+"\n"
                + "Altura: "+altura+"\n"
                + "Area: "+decimalFomrat.format(area);
    return area;
    }//fin metodo calcArea()
    
}//fin clase Atrapecio