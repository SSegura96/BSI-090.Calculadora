/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjeturas;

import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public abstract class AbCalculo implements ICalculo
{
    String mensaje;
    
    public AbCalculo ()
    {
        mensaje = "";
    }
    
    public void mostarDatos()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
