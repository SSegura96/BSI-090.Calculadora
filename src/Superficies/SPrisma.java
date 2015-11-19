package Superficies;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SPrisma extends SFigura
{
    private double altura;
    private double numLadosBase;
    private double valorLado;
    private double perimBase;
    private double apotemaBase;
    private double areaBase;
    private double superficieLateral;
    
    public SPrisma() 
    {
        altura = 0.0;
        numLadosBase = 0.0;
        valorLado = 0.0;
        perimBase = 0.0;
        apotemaBase = 0.0;
        areaBase = 0.0;
        superficieLateral = 0.0;
        figura = "Prisma";
    }//fin constructor

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getNumLadosBase() {
        return numLadosBase;
    }

    public void setNumLadosBase(double numLadosBase) {
        this.numLadosBase = numLadosBase;
    }

    public double getValorLado() {
        return valorLado;
    }

    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }

    public double getPerimBase() {
        return perimBase;
    }

    public void setPerimBase(double perimBase) {
        this.perimBase = perimBase;
    }

    public double getApotemaBase() {
        return apotemaBase;
    }

    public void setApotemaBase(double apotemaBase) {
        this.apotemaBase = apotemaBase;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
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
        todoBien = true;//se limpia la variable.
        
        //Se pide el valor de la altura y se valida.
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
        
        //Se pide valor del lado y se valida
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
        
        //Se pide la cantidad de lados de la base y se valida
        do
        {
            try
            {
                String valor = JOptionPane.showInputDialog(null, "Digite el numero"
                        + " de lados que posee la base:", figura, JOptionPane.INFORMATION_MESSAGE);
                
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
    
    private void calcularApotema()
    {
        double angRadianes;
        double angCentral;
        //se saca el algulo central y lo convertimos a radianes para poder sacar la tangencia.
        angCentral = 360 / numLadosBase;
        angRadianes = Math.toRadians(angCentral);
        //Se saca el apotema: Lado/2*tan(angRadianes/2)
        apotemaBase = numLadosBase / (2 * Math.tan(angRadianes / 2));
    }//fin calcularApotema()
    
    @Override
    public void calcSuperficie() 
    {
        perimBase = numLadosBase * valorLado;
        
        superficieLateral = perimBase*altura;
        
        areaBase = (perimBase * apotemaBase)/2;
        
        superficie = superficieLateral+(2*areaBase);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        mensaje = "Altura: "+altura+"\n"
                + "Perimetro de la Base: "+perimBase+"\n"
                + "Area de la Base: "+df.format(areaBase)+"\n"
                + "Superficie Lateral: "+df.format(superficieLateral)+"\n"
                + "Superficie Total: "+df.format(superficie);
    }//fin metodo calcSuperficie()
    
}//fin clase SPrisma