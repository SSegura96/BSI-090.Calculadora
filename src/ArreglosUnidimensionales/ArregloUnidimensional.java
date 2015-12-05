package ArreglosUnidimensionales;

import CalculadoraAvanzada.ManejoErrores;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class ArregloUnidimensional implements IArreglosUnidimensionales {

    protected double[] vector;
    protected double[] vector2;
    protected double tamanno;
    protected String mensaje;
    protected String titulo;
    //Se utiliza esta clase generica para llamar a los errores personalizados.
    protected ManejoErrores fallo = new ManejoErrores();

    public ArregloUnidimensional() {
        tamanno = 0.0;
        vector = new double[0];
        vector2 = new double[0];
        titulo = "Vector";
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

    public double getTamanno() {
        return tamanno;
    }

    public void setTamanno(double tamanno) {
        this.tamanno = tamanno;
    }

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

    public ManejoErrores getFallo() {
        return fallo;
    }

    public void setFallo(ManejoErrores fallo) {
        this.fallo = fallo;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }//fin metodo mostrarDatos()

}//fin clase ArregloUnidimensional
