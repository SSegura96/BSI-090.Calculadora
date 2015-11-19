package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SPiramideRegular extends SFigura
{
    private double arista;
    private double altura;
    private int numLadosBase;
    private double apotema;
    private double perimBase;
    private double superficieLateral;
    private double areaBase;

    public SPiramideRegular() 
    {
        arista = 0.0;
        altura = 0.0;
        numLadosBase = 0;
        apotema = 0.0;
        perimBase = 0.0;
        superficieLateral = 0.0;
        areaBase = 0.0;
        figura = "PiramideRegular";
    }//fin constructor

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumLadosBase() {
        return numLadosBase;
    }

    public void setNumLadosBase(int numLadosBase) {
        this.numLadosBase = numLadosBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getPerimBase() {
        return perimBase;
    }

    public void setPerimBase(double perimBase) {
        this.perimBase = perimBase;
    }

    public double getSuperficieLateral() {
        return superficieLateral;
    }

    public void setSuperficieLateral(double superficieLateral) {
        this.superficieLateral = superficieLateral;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    
    @Override
    public void pedirDatos() 
    {
        todoBien = true;//se limpia la variable.
        
        //Se pide el valor de la arista y se valida.
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " de la arista:", "Piramide Regular", JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                arista = Double.parseDouble(valor);
                
                if (arista <= 0)
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
        
        //Se pide valor de la altura y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el valor"
                        + " de la altura:", "Piramide Regular", JOptionPane.INFORMATION_MESSAGE);
                
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
        
        //Se pide la cantidad de lados de la base y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el numero"
                        + " de lados que posee la base:", "Piramide Regular", JOptionPane.INFORMATION_MESSAGE);
                
                if (valor.equals("") || valor.equals(" "))
                {
                    tituloError = "Error";
                    tipoError = 1;
                    imgError = 0;
                    
                    throw new NumberFormatException();
                }//fin primer if de validacion
                
                numLadosBase = Integer.parseInt(valor);
                
                if (numLadosBase <= 0)
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
        DecimalFormat df = new DecimalFormat("0.00");
        
        perimBase = numLadosBase * arista;
        
        apotema = Math.sqrt((Math.pow(altura, 2))+(Math.pow((arista/2), 2)));
        
        superficieLateral = (perimBase * apotema)/2;
        
        areaBase = (perimBase * apotema)/2;
        
        superficie = superficieLateral + areaBase;
        
        mensaje = "Apotema: "+arista+"\n"
                + "Perimetro de la Base: "+perimBase+"\n"
                + "Area de la la Base:"+df.format(areaBase)+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
    }//fin metodo calcSuperficie
    
}//fin calse SPiramideRegular