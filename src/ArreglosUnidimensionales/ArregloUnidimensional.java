package ArreglosUnidimensionales;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ArregloUnidimensional {

    protected double[] vector;
    protected double[] vector2;
    protected int tamanno;
    protected String mensaje;

    public ArregloUnidimensional() {
        tamanno = 0;
        vector = new double[0];
        vector2 = new double[0];
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

    
    public void pedirDatos() {
        JOptionPane.showInputDialog(null, "Pedir datos necesarios al usario.");
    }//fin metodo pedirDatos()

    public void llenarVector() {
        JOptionPane.showMessageDialog(null, "Llenar el primer vector vector[ ]");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato vector[" + i + "]"));
        }//fin primer for

        JOptionPane.showMessageDialog(null, "Llenar vector vector2[ ]");
        for (int j = 0; j < vector2.length; j++) {
            vector2[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato vector2[" + j + "]"));
        }//fin segundo for
    }//fin metodo llenarVector()

    public String recorrerVector(double[] vector1)
    {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) 
        {
            dato = ""+vector1[i]+", ";
        }//foin primer for
        
        return dato;
        
    }//fin metodo recorrerVector
            
    public void mostrarImagen(String vector) {
        JOptionPane.showMessageDialog(null, "", vector,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/" + vector + ".png"));
    }//fin metodo mostrarImagen

    public void resultado() {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()

}//fin clase ArregloUnidimensional