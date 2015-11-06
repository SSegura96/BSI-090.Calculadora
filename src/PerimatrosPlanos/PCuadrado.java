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
