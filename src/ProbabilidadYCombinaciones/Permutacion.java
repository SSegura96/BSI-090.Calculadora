package ProbabilidadYCombinaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Permutacion extends ProbabilidadYCombinaciones
{
    
    private int grupoElementos;
    private int permutacion;

    public Permutacion() 
    {
        grupoElementos = 0;
        permutacion = 0;
    }//fin constructor

    public int getGrupoElementos() {
        return grupoElementos;
    }

    public void setGrupoElementos(int grupoElementos) {
        this.grupoElementos = grupoElementos;
    }

    public int getPermutacion() {
        return permutacion;
    }

    public void setPermutacion(int permutacion) {
        this.permutacion = permutacion;
    }
    
    @Override
    public void pedirDatos()
    {
        cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad total de elementos:"));
        
        grupoElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite en grupos de cuanto quiere agrupar los elementos:"));
        
    }//fin metodo pedirDatos()

    
    public void calcPermutacion()
    {
        Factorial facNumElementos = new Factorial();
        facNumElementos.setNumero(cantidadElementos);
        
        Factorial facOperacion = new Factorial();
        facOperacion.setNumero(cantidadElementos - grupoElementos);
        
        permutacion = facNumElementos.calcFactorial() / facOperacion.calcFactorial();
         
        mensaje = "Cantidad de Elementos: "+cantidadElementos+"\n"
                + "Grupos de elementos: "+grupoElementos+"\n"
                + "Permutacion: "+permutacion;
         
    }//fin metodo calcPermutacion()
    
}//fin clase Permutacion