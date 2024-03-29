package ProbabilidadYCombinaciones;

import CalculadoraAvanzada.ManejoErrores;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class ProbabilidadYCombinaciones implements IProbabilidadYCombinaciones {

    protected String mensaje;
    protected String imagen;
    protected double cantidadElementos;
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    ManejoErrores fallo = new ManejoErrores();

    public ProbabilidadYCombinaciones() {
        mensaje = "";
        imagen = "";
        cantidadElementos = 0;
        todoBien = true;
        tituloError = "";
        tipoError = 0;
        imgError = 0;
    }//fin constuctor

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(double cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    public double enmascararDouble(double numero) {
        String dato = "";

        DecimalFormat decimalFormat = new DecimalFormat("#######.##");

        dato = decimalFormat.format(numero);

        dato = dato.replace(',', '.');

        return Double.parseDouble(dato);
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, mensaje, imagen, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo

}//fin clase ProbabilidadYCombinaciones
