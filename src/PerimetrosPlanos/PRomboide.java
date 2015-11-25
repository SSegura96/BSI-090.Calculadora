package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class PRomboide extends PFigura 
{
    protected double base;
    protected double altura;

    public PRomboide() 
    {
        base = 0;
        altura = 0;
        figura = "Romboide";
    }//fin constrcutor

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void pedirDatos ()
    {
        boolean todoBienBase = true;
        boolean todoBienAltura = true;
        
        do 
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
                base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base:"));
                
                if (base <= 0)
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBienBase = true;
                
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBienBase = false;
            }
        }while (!todoBienBase);
        
         do 
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
                altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura:"));
                
                if (altura <= 0)
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBienAltura = true;
                
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBienAltura = false;
            }
        }while (!todoBienAltura);
         
    }//fin metodo pedirDatos()

    @Override
    public void calcPerimetro ()
    {
        perimetro = (2*base)+(2*altura);
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base: "+base+"\n"
                + "Altura: "+altura+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()
}//fin clase PRomboide
