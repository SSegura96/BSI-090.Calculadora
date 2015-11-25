package PerimetrosPlanos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class PTrapecio extends PFigura
{
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;

    public PTrapecio() 
    {
        baseMayor = 0.0;
        baseMenor = 0.0;
        lado1 = 0.0;
        lado2 = 0.0;
        figura = "Trapecio";
    }//fin constructor

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public void pedirDatos() 
    {
        boolean todoBienBaseMayor = true;
        boolean todoBienBaseMenor = true;
        boolean todoBienLado1 = true;
        boolean todoBienLado2 = true;
        
        do 
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
               baseMayor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base mayor:"));
                
                if (baseMayor <= 0)
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBienBaseMayor = true;
                
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBienBaseMayor = false;
            }
        }while (!todoBienBaseMayor);
        
        do 
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
               baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base menor:"));
                
                if (baseMenor <= 0)
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBienBaseMenor = true;
                
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBienBaseMenor = false;
            }
        }while (!todoBienBaseMenor);
        
       do 
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
               lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del primer lado:"));
                
                if (lado1 <= 0)
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBienLado1 = true;
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBienLado1 = false;
            }
        }while (!todoBienLado1);
       
       do 
        {
            try
            {
                tituloError = "Advertencia";
                tipoError = 1;
                imgError = 2;
                
                lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del segundo lado:"));
                
                if (lado2 <= 0)
                {
                    tituloError = "Error";
                    tipoError = 0;
                    imgError = 0;
                    throw new NumberFormatException();
                }
                
                todoBienLado2 = true;
            }
            catch (NumberFormatException e)
            {
                fallo.seleccionarMensaje(tipoError, figura, imgError);
                todoBienLado2 = false;
            }
        }while (!todoBienLado2);
       
    }//fin metodo pedirDatos()
    
    @Override
    public void calcPerimetro() 
    {
        perimetro = baseMayor + baseMenor + lado1 + lado2;
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Base Mayor: "+baseMayor+"\n"
                + "Base Menor: "+baseMenor+"\n"
                + "Primer lado: "+lado1+"\n"
                + "Segundo lado: "+lado2+"\n"
                + "Perimetro: "+df.format(perimetro);
    }//fin metodo calcPerimetro()
    
}//fin clase PTrapecio