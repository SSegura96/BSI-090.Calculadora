package AreasPlanas;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class AFigura implements AIFigura 
{

    protected double area;
    protected String figura;
    protected String mensaje;
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    protected ManejoErrores fallo = new ManejoErrores();

    public AFigura() 
    {
        area = 0;
        mensaje = "";
        todoBien = true;
        tituloError = "";
        tipoError = 0;
        imgError = 0;
    }//fin constructor

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
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

    public boolean isTodoBien() {
        return todoBien;
    }

    public void setTodoBien(boolean todoBien) {
        this.todoBien = todoBien;
    }

    public String getTituloError() {
        return tituloError;
    }

    public void setTituloError(String tituloError) {
        this.tituloError = tituloError;
    }

    public int getTipoError() {
        return tipoError;
    }

    public void setTipoError(int tipoError) {
        this.tipoError = tipoError;
    }

    public int getImgError() {
        return imgError;
    }

    public void setImgError(int imgError) {
        this.imgError = imgError;
    }

    public ManejoErrores getFallo() {
        return fallo;
    }

    public void setFallo(ManejoErrores fallo) {
        this.fallo = fallo;
    }

    
    public void mostrarImagen() 
    {
        JOptionPane.showMessageDialog(null, "", figura,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/" + figura + ".png"));
    }//fin metodo mostrarImagen()

    public void mostarDatos() 
    {
        JOptionPane.showMessageDialog(null, mensaje, figura, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo mostarDatos()

}//fin clase Abstracta AFigura
