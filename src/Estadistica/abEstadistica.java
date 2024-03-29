package Estadistica;

import CalculadoraAvanzada.ManejoErrores;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class abEstadistica implements IEstadistica {

    String mensaje;
    String titulo;
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    ManejoErrores fallo = new ManejoErrores();

    public abEstadistica() {
        mensaje = "";
        titulo = "";
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public double enmascararDouble(double numero) {
        String dato = "";

        DecimalFormat decimalFormat = new DecimalFormat("#######.##");

        dato = decimalFormat.format(numero);

        dato = dato.replace(',', '.');

        return Double.parseDouble(dato);
    }

    @Override
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo mostarDatos()

}//fin clase abEstadistica
