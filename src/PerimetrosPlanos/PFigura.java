package PerimetrosPlanos;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public abstract class PFigura implements PIFigura
{
    public double perimetro;
    public ManejoErrores fallo = new ManejoErrores ();
    protected String figura;
    protected String mensaje;

    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    
    public PFigura() 
    {
        perimetro = 0;
        figura = "";
        todoBien = true;
        tituloError = "";
        tipoError = 1;
        imgError = 0;
    }//fin constrcutor

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public void mostrarImagen ()
    {
        JOptionPane.showMessageDialog(null,"", figura,
        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/P"+figura+".png"));
    }//fin metodo mostrarImagen
    
    public void mostrarDatos ()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()
    
}//fin clase PFigura
