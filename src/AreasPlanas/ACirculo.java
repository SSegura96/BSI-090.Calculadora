package AreasPlanas;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ACirculo extends AFigura 
{

    private double radio;

    public ACirculo() 
    {
        radio = 0;
        figura = "Circulo";
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
        
        //Se pide el valor del radio y se valida
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
        
    }//fin clase pedirDatos

    @Override
    public double calcArea() 
    {
        area = Math.PI * Math.pow(radio, 2);

        mensaje = "Radio: " + radio + "\n"
                + "Area: " + decimalFomrat.format(area);
    return area;
    }//fin metodo calcArea ()

}//fin clase ACirculo
