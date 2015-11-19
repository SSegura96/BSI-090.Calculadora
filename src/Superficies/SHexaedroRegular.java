package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SHexaedroRegular extends SFigura
{
    private double lado;
    private double superficieLateral;
    
    public SHexaedroRegular() 
    {
        lado = 0.0;
        figura = "HexaedroRegular";
    }//fin constructor

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public void pedirDatos() 
    {
        todoBien = true;//se limpia la variable
        
        //Se pide la medida del lado y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " del lado:", "Hexaedro Regular", JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                lado = Double.parseDouble(valor);
                
                if (lado <= 0)
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
    }//fin metodo pedirDator()

    @Override
    public void calcSuperficie() 
    {
        superficieLateral = 4*Math.pow(lado, 2);
        
        superficie = 6*Math.pow(lado, 2);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Lado: "+lado+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SHexaedroRegular