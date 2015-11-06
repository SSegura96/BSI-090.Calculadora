/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerimatrosPlanos;

/**
 *
 * @author Sergio Segura Vidal
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

    public void calcPerimetro ()
    {
        perimetro = (2*base)+(2*altura);
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
