/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerimetrosPlanos;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */

public class PCuadrado extends PFigura 
{
    protected double valorlado;

    public PCuadrado()
    {
        valorlado = 0;
    }
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorlado*4;
        
        mensaje = "Valor del lado: "+valorlado+"\n"
                + "Perimetro: "+perimetro;
    }
    
    @Override
    public void pedirDatos ()
    {
        valorlado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado"));
    }
    
    public double getValorlado() 
    {
        return valorlado;
    }

    public void setValorlado(double valorlado) 
    {
        this.valorlado = valorlado;
    }
}
