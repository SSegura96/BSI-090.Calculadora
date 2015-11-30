package Superficies;

import CalculadoraAvanzada.ManejoErrores;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class SFigura implements SIFigura {

    protected double superficie;
    protected String figura;
    protected String mensaje;
    DecimalFormat decimalFormat = new DecimalFormat();
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    protected ManejoErrores fallo = new ManejoErrores();

    public SFigura() {
        superficie = 0.0;
        figura = "";
        mensaje = "";
    }//fin constructor

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public ManejoErrores getFallo() {
        return fallo;
    }

    public void setFallo(ManejoErrores fallo) {
        this.fallo = fallo;
    }

    public void mostrarImagen() {
        JOptionPane.showMessageDialog(null, "", figura,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/" + figura + ".png"));
    }//fin metodo mostrarImagen

    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, mensaje, figura, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo resultado()
}//fin clase SFigura
