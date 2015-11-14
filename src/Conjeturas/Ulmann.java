package Conjeturas;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Ulmann extends AbCalculo
{
    double numeroIngresado;
    double resultado;
    
    public Ulmann ()
    {
        numeroIngresado = 0;
        resultado = 0;
        datos = "";
    }
    
    @Override
    public void pedirDatos ()
    {
        numeroIngresado = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
    }
    
    public void calcUlmann()
    {        
        resultado = numeroIngresado;
        datos = "El resultado es: \n"+numeroIngresado+"";
        while (resultado != 1)
        {
            if ((resultado%2)==0)
            {
                resultado /= 2;
            }
            else
            {
                resultado = (resultado*3)+1;
            }
            
            datos += "\n"+resultado;
        }
    }
    
}
