package ProbabilidadYCombinaciones;

import javax.swing.JOptionPane;
import CalculadoraAvanzada.Error;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Factorial extends ProbabilidadSimple
{
    private int numero;

    public Factorial()
    {
        numero = 0;
        factorial = 0;
        mensaje = "";
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }
    
    @Override
    public void pedirDatos () throws NumberFormatException
    {
        boolean todoBien = true;
        int numError = 0;
        
        do
        {
            try
            {
                numero = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el numero al cual le decea calcular el factorial",
                    "Digite un numero entero"));
                
                if (numero < 0)
                {
                    numError = 1; 
                    throw new NumberFormatException();
                }
                
                todoBien = true;
            }
            catch (NumberFormatException e)
            {
                todoBien = false;
                Error error = new Error ();
                JOptionPane.showMessageDialog(null,error.seleccionarMensaje(numError));
            }
        }while (!todoBien);
    }
    
    public int calcFactorial ()
    {
        mensaje = "El resultado de "+numero+"! es: \n";
        
        if (numero != 0)
        {
            int numeroTemp = numero;
            
            factorial = 1;
        
            while (numeroTemp != 0)
            {
                mensaje += numeroTemp+" X ";

                factorial *= numeroTemp;
                numeroTemp--;
            }
            mensaje = mensaje.substring(0,mensaje.length()-3);
            mensaje += " = "+factorial;
        }
        else
        {
           mensaje += "1 X 1 = 1";
           factorial = 1;
        }
        
        return factorial;
    }
}
