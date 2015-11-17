package ProbabilidadYCombinaciones;

import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Factorial extends ProbabilidadSimple
{
    int numero;

    public Factorial()
    {
        numero = 0;
        mensaje = "";
    }
    
    @Override
    public void pedirDatos ()
    {
        numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite el numero al cual le decea calcular el factorial"));
    }
    
    public void calcFactorial ()
    {
        int numeroTemp = numero;
        factorial = 1;
        mensaje = "El resultado es: \n";
        
        while (numeroTemp != 0)
        {
            mensaje += numeroTemp+" X ";
            
            factorial *= numeroTemp;
            numeroTemp--;
        }
        mensaje = mensaje.substring(0,mensaje.length()-3);
        mensaje += " = "+factorial;
    }
}
