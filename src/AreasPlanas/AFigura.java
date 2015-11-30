package AreasPlanas;

import CalculadoraAvanzada.ManejoErrores;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class AFigura implements AIFigura {

    protected double area;
    protected String figura;
    protected String mensaje;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    protected ManejoErrores fallo = new ManejoErrores();

    public AFigura() {
        area = 0;
        mensaje = "";
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
    }//fin metodo mostarDatos()

}//fin clase Abstracta AFigura
