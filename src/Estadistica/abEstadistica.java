package Estadistica;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Segura Vidal
 */
public abstract class abEstadistica implements IEstadistica
{
    String mensaje;
    String imagen;
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    ManejoErrores fallo = new ManejoErrores();

    public abEstadistica() 
    {
        mensaje = "";
        todoBien = true;
        tituloError = "";
        tipoError = 0;
        imgError = 0;
    }//fin constructor

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    
    @Override
    public void mostrarDatos() 
    {
        JOptionPane.showMessageDialog(null, mensaje, imagen, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo mostarDatos()

    @Override
    public void mostrarImagen() 
    {
        JOptionPane.showMessageDialog(null, "", imagen,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/" + imagen + ".png"));
    }//fin metodo mostrarImagen()
    
}//fin clase abEstadistica
