package ProbabilidadYCombinaciones;

import javax.swing.ImageIcon;
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
    public void mostrarImagen() 
    {
        JOptionPane.showMessageDialog(null, "", "Permutacion",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/Permutacion.png"));
    }//fin metodo mostrarImagen
    
    @Override
    public void pedirDatos()
    {
        cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad totoal de elementos:"));
        
        grupoElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite en grupos de cuanto quiere agrupar los elementos:"));
        
    }//fin metodo pedirDatos()
    
    private int Factorial(int numero)
    {
        while(numero > 1)
        {
            numero = numero * (numero-1);
        }//fin while
        return numero;
    }//fin metodo calcFactorial
    
    public void calcPermutacion()
    {
         permutacion = Factorial(cantidadElementos)/Factorial((cantidadElementos-grupoElementos));
         
         mensaje = "Cantidad de Elementos: "+cantidadElementos+"\n"
                 + "Grupos de elementos: "+grupoElementos+"\n"
                 + "Permutacion: "+permutacion;
         
    }//fin metodo calcPermutacion()
    
    @Override
    public void resultado()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()
    
}//fin clase Permutacion