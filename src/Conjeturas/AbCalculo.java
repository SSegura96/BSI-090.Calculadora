package Conjeturas;

import CalculadoraAvanzada.ManejoErrores;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class AbCalculo implements ICalculo {

    protected String figura;
    protected String mensaje;
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    protected ManejoErrores fallo = new ManejoErrores();

    public AbCalculo() {
        figura = "";
        mensaje = "";
        todoBien = true;
        tituloError = "";
        tipoError = 0;
        imgError = 0;
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

    public double enmascararDouble(double numero) {
        String dato = "";

        DecimalFormat decimalFormat = new DecimalFormat("#######.##");

        dato = decimalFormat.format(numero);

        dato = dato.replace(',', '.');

        return Double.parseDouble(dato);
    }

    public void mostrarImagen() {
        JOptionPane.showMessageDialog(null, "", figura,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/" + figura + ".png"));
    }//fin metodo mostrarImagen()

    public void mostarDatos() {
        JOptionPane.showMessageDialog(null, mensaje, figura, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo mostrarDatos()

}//fin class  abCalculo
