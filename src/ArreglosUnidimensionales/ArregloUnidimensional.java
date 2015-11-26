package ArreglosUnidimensionales;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class ArregloUnidimensional implements IArreglosUnidimensionales{

    protected double[] vector;
    protected double[] vector2;
    protected int tamanno;
    protected String mensaje;
    protected String imagenV;
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    protected ManejoErrores fallo = new ManejoErrores();
    
    public ArregloUnidimensional() 
    {
        tamanno = 0;
        vector = new double[0];
        vector2 = new double[0];
        imagenV = "Vector";
        todoBien = true;
        tituloError = "";
        tipoError = 0;
        imgError = 0;
    }//fin constructor

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public double[] getVector2() {
        return vector2;
    }

    public void setVector2(double[] vector2) {
        this.vector2 = vector2;
    }

    public int getTamanno() {
        return tamanno;
    }

    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getImagenV() {
        return imagenV;
    }

    public void setImagenV(String imagenV) {
        this.imagenV = imagenV;
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
    
            
    public void mostrarImagen() {
        JOptionPane.showMessageDialog(null, "", imagenV,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/" + imagenV + ".png"));
    }//fin metodo mostrarImagen

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, mensaje, imagenV, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo mostrarDatos()

}//fin clase ArregloUnidimensional