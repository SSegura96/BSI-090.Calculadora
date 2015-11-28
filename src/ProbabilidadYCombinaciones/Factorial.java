package ProbabilidadYCombinaciones;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Factorial extends ProbabilidadYCombinaciones
{
    private double numero;
    private double factorial;

    public Factorial()
    {
        numero = 0;
        factorial = 0;
        mensaje = "";
        imagen = "Factorial";
    }

    public double getNumero() 
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
        numero = fallo.doubleValidarExcepciones("Digite el numero al cual le decea calcular el factorial", imagen);
    }
    
    public double calcFactorial ()
    {
        mensaje = "El resultado de "+numero+"! es: \n";
        
        if (numero != 0)
        {
            double numeroTemp = numero;
            
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
