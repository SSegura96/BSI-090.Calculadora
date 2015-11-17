package Conjeturas;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Gilbreath extends AbCalculo
{
    private LinkedList primos = new LinkedList();
    private int contadorPrimos;

    public Gilbreath() 
    {
        contadorPrimos = 11;
    }//fin constructor

    public int getContadorPrimos() {
        return contadorPrimos;
    }

    public void setContadorPrimos(int contadorPrimos) {
        this.contadorPrimos = contadorPrimos;
    }
    
    
    @Override
    public void pedirDatos() 
    {
        int num = 0;//almacena temporalmente el numero a evaluar
        int salir = 0;//controla la entrada y salida del while

        //Se alamacenan los 10 numeros primos en la LinkedList
        do 
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero primo, "
                    + "(el siguiente numero tiene que ser consecutivo al digitado actualmente): \n"
                    + "\t \t Valor #"+ (salir+1) +" de 10"));

            //se evalua que el numero sea primo
            if (num % 2 == 0) 
            {
                JOptionPane.showMessageDialog(null, "Digite solo numeros primos.");
            }//fin if 
            else
            {
                primos.addLast(num);
                salir++;
            }//fin else

        } while (salir < 11);//fin do-while

    }//fin metodo pedirDatos()
    
    public void calcGilbreath()
    {
        
    }//fin metodo calcGilbreath()
    
}//fin clase Gilbreath