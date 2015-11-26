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
    private double combinatora;
    
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
       numElementos = fallo.intValidarExcepciones
        ("Digite el numero de elementos");
                
        numSubgrupo = fallo.intValidarExcepciones
        ("Digite el elemetos en el subgrupo");
    }
    
    public double calcCombinatoria ()
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
