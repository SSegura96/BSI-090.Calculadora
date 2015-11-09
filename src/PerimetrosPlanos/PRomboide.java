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

public class PRomboide extends PFigura 
{
    protected double base;
    protected double altura;

    public PRomboide() 
    {
        base = 0;
        altura = 0;
    }

    @Override
    public void calcPerimetro ()
    {
        perimetro = (2*base)+(2*altura);
        
        mensaje = "Base: "+base+"\n"
                + "Altura: "+altura+"\n"
                + "Perimetro: "+perimetro;
    }
    
    @Override
    public void pedirDatos ()
    {
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura"));
    }
    
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
}
