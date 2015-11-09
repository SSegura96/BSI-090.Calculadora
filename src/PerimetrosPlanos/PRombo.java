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

public class PRombo extends PFigura
{
    protected double valorLado;

    public PRombo()
    {
        valorLado = 0;
    }
    
    @Override
    public void calcPerimetro ()
    {
        perimetro = valorLado*4;
        
        mensaje = "Valor del lado: "+valorLado+"\n"
                + "Perimetro: "+perimetro;
    }
    
    public void pedirDatos ()
    {
        valorLado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado"));
    }
    
    public double getValorlado() 
    {
        return valorLado;
    }

    public void setValorlado(double valorlado) 
    {
        this.valorLado = valorlado;
    }
}
