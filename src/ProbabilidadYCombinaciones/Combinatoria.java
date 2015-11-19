package ProbabilidadYCombinaciones;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Combinatoria extends ProbabilidadYCombinaciones
{
    private int numElementos;
    private int numSubgrupo;
    private int combinatora;
    
    public Combinatoria ()
    {
        numElementos = 0;
        numSubgrupo = 0;
        combinatora = 0;
    }

    public int getNumElementos() 
    {
        return numElementos;
    }

    public void setNumElementos(int numElementos) 
    {
        this.numElementos = numElementos;
    }

    public int getNumSubgrupo() 
    {
        return numSubgrupo;
    }

    public void setNumSubgrupo(int numSubgrupo) 
    {
        this.numSubgrupo = numSubgrupo;
    }
    
    @Override
    public void pedirDatos () throws NumberFormatException
    {
        boolean todoBienElementsos = true;
        boolean todoBienSubgrupos = true;
        int numError = 0;
        int tipo = 0;
        
        try
        {
            do 
            {
                numElementos = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite el numero de elementos"));
                
                if (numElementos <= 0)
                {
                    numError = 2;
                    throw new NumberFormatException();
                }
                
                todoBienElementsos = true;
                
            }while (!todoBienElementsos);
            
            do 
            {
                numSubgrupo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite el elemetos en el subgrupo"));
                
                if (numSubgrupo <= 0)
                {
                    numError = 2;
                    throw new NumberFormatException();
                }
                
                todoBienSubgrupos = true;
                
            }while (!todoBienElementsos); 
        }
        catch (NumberFormatException e)
        {
            ManejoErrores me = new ManejoErrores ();
            
            if (tipo == 0)
            {
                todoBienElementsos = false;
            }
            else
            { 
                todoBienSubgrupos = false;
            }
            
            me.seleccionarMensaje(1,"error",1);
        }
    }
    
    public int calcCombinatoria ()
    {
        int operacion = 1;
        int numTemp = numElementos;
        int i = numSubgrupo;
        
        Factorial facNumElementos = new Factorial (); 
        Factorial facNumGrupo = new Factorial (); 
        
        facNumElementos.setNumero(numElementos);
        facNumGrupo.setNumero(numSubgrupo);
        
        while (i != 0)
        {
            operacion *= numTemp--;
                    
            i--;
        }
        
        combinatora = operacion/facNumGrupo.calcFactorial();
        
        mensaje = "Numero de elementos: "+numElementos+"\n"
                + "Numero de elementos del sub grupo: "+numSubgrupo+"\n"
                + "Numero de posibles combinaciones: "+combinatora;
        
        return combinatora;
    }
}
