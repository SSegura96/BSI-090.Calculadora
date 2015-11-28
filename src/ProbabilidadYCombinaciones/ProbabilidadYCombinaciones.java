package ProbabilidadYCombinaciones;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class ProbabilidadYCombinaciones implements IProbabilidadYCombinaciones
{
    protected String mensaje;
    protected String imagen;
    protected int cantidadElementos;
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    ManejoErrores fallo = new ManejoErrores();

    public ProbabilidadYCombinaciones() 
    {
        mensaje = "";
        imagen = "";
        cantidadElementos = 0;
        todoBien = true;
        tituloError = "";
        tipoError = 0;
        imgError = 0;
    }//fin constuctor
    
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
    
    
    public void mostrarDatos()
    {
        JOptionPane.showMessageDialog(null, mensaje, imagen, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo 
    
    public void mostrarImagen()
    {
        JOptionPane.showMessageDialog(null,"", imagen,JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon("src/imgs/"+imagen+".png"));
    }//fin metodo mostrarImagen()
    
}//fin clase ProbabilidadYCombinaciones