package AreasPlanas;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ATriangulo extends AFigura
{
    private double medidaLado;

    public ATriangulo() 
    {
        medidaLado = 0.0;
        figura = "Triangulo";
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
    }//fin clase pedirDatos@Override
    
    @Override
    public double calcArea() 
    {
        //Formula utilizada: 
        area = ((Math.sqrt(3))*Math.pow(medidaLado, 2))/4;
        
        mensaje = "La media del lado es: "+medidaLado+"\n"
                + "El area es: "+decimalFomrat.format(area);
    return area;
    }//fin metodo calcArea()
    
}//fin clase ATriangulo