package ProbabilidadYCombinaciones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class ProbabilidadYCombinaciones implements IProbabilidadYCombinaciones
{
    protected String mensaje;
    protected String nombre;
    protected int cantidadElementos;

    public ProbabilidadYCombinaciones() 
    {
        mensaje = "";
        cantidadElementos = 0;
    }//fin constructor

    public String getMensaje() 
    {
        return mensaje;
    }

    public void setMensaje(String mensaje) 
    {
        this.mensaje = mensaje;
    }

    public int getCantidadElementos() 
    {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) 
    {
        this.cantidadElementos = cantidadElementos;
    }
    
    public void mostrarResultado()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void mostrarImagen()
    {
        JOptionPane.showMessageDialog(null,"", nombre,
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/"+nombre+".png"));
    }//fin metodo mostrarImagen()
    
}//fin clase ProbabilidadYCombinaciones