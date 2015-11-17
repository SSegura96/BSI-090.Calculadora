package ProbabilidadYCombinaciones;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ProbabilidadSimple 
{
    private double cantidadElementos;//cantidad total de elementos
    private double posibilidadEscoger;//posibilidades de escoger un elemento
    private double probabilidad;//probabilidad simple
    private String mensaje;

    public ProbabilidadSimple() 
    {
        cantidadElementos = 0;
        posibilidadEscoger = 0;
        probabilidad = 0;
        mensaje="";
    }//fin constructor

    public double getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(double cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    public double getPosibilidadEscoger() {
        return posibilidadEscoger;
    }

    public void setPosibilidadEscoger(double posibilidadEscoger) {
        this.posibilidadEscoger = posibilidadEscoger;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
     public void mostrarImagen() 
    {
        JOptionPane.showMessageDialog(null, "", "ProbabilidadSimple",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/ProbabilidadSimple.png"));
    }//fin metodo mostrarImagen
     
     public void pedirDatos()
    {
        cantidadElementos = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad totoal de elementos:"));
        
        posibilidadEscoger = Double.parseDouble(JOptionPane.showInputDialog("Digite la posibilidad de escoger un elemento diferente:"));
        
    }//fin metodo pedirDatos()
     
     public void calcProbabilidadSimple()
     {
         probabilidad = cantidadElementos/posibilidadEscoger;
         DecimalFormat df = new DecimalFormat("0.00");
         
         mensaje = "Cantidad total de elementos: "+cantidadElementos+"\n"
                 + "Cantidad de posibles elemntos: "+posibilidadEscoger+"\n"
                 + "Probabilidad Simple: "+df.format(probabilidad)+"%";
     }//fin metodo calcProbabilidadSimple()
     
     public void resultado()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()
     
}//fin clase ProbabilidadSimple