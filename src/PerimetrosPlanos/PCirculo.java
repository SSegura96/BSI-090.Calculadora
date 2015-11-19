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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void pedirDatos () throws NumberFormatException
    {
        boolean todoBien = true;
        String titulo;
        int tipoError = 0;
        int imgError = 0;
        
        do
        { 
            
            try
            {
                String valor  = JOptionPane.showInputDialog("Digite el radio:");
                
                if (valor.equals("") || valor.equals(" "))
                {
                   titulo = "Error";
                   imgError = 0;
                   tipoError = 1;
                   throw new NumberFormatException();
                }
                
                radio = Double.parseDouble(valor);
                
                if (radio <= 0)
                {
                    titulo = "Aviso";
                    imgError = 2;
                    tipoError = 0;
                    throw new NumberFormatException();
                }
                
                todoBien = true;
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBien = false;
            }
    
         }while (!todoBien);
        
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
