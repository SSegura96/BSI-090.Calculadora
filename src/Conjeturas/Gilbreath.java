package Conjeturas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Gilbreath extends AbCalculo
{
    private LinkedList <Integer> primos = new LinkedList();
    private LinkedList <Integer> renglon3 = new LinkedList();
    private LinkedList <Integer> renglon4 = new LinkedList();
    private LinkedList <Integer> renglon5 = new LinkedList();
    private LinkedList <Integer> renglon6 = new LinkedList();
    private LinkedList <Integer> renglon7 = new LinkedList();
    private LinkedList <Integer> renglon8 = new LinkedList();
    private LinkedList <Integer> renglon9 = new LinkedList();
    
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
            if (num % 2 != 0 || num == 2) 
            {
                primos.addLast(num);
                salir++;
            }//fin if 
            else
            {
                JOptionPane.showMessageDialog(null, "Digite solo numeros primos.");
            }//fin else

        } while (salir < 10);//fin do-while

    }//fin metodo pedirDatos()
    
    public String cargarNumeros(LinkedList <Integer> lista)
    {
        ArrayList lista2 = new ArrayList (lista);
        
        Iterator it = lista2.iterator();
        
        String renglon = "";
        
        while (it.hasNext())
        {
            renglon += it.next()+" - ";
        }//fin while
        
        renglon = renglon.substring(0, renglon.length()-2);
        
        return renglon;
    }//fin metodo cargarNumeros(LinkedList <Integer> lista)
    
    public String cargarRenglon2 (LinkedList <Integer> lista, LinkedList <Integer> lista2)
    {
        
        String renglon = "";
        int resultado;
        int indice = 0;
        boolean salir = true;
        
        while (salir)
        {
            if (lista.get(indice+1) != lista.getLast())
            {
                resultado = (lista.get(indice) - lista.get(indice+1));
                lista2.addLast(resultado);
                resultado = Math.abs(resultado);
                renglon += resultado+" - ";
                indice++;
                
            }//fin else
            else
            {
                resultado = lista.get(lista.size()-2) - lista.get(lista.size()-1);
                
                resultado = Math.abs(resultado);
                
                renglon += resultado;
                salir = false;
            }//fin if
            
        }//fin while
        
        return renglon;
    }//fin metodo cargarReglon()
    
    public void calcGilbreath()
    {
        mensaje = ""+cargarNumeros(primos)+"\n"
                + "----------------------------------------------------- \n"
                + ""+cargarRenglon2(primos,renglon3)+"\n"
                + ""+cargarRenglon2(renglon3,renglon4);
    }//fin metodo calcGilbreath()
    
}//fin clase Gilbreath