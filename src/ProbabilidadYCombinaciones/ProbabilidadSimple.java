package ProbabilidadYCombinaciones;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ProbabilidadSimple extends ProbabilidadYCombinaciones
{
    private int posibilidadEscoger;//posibilidades de escoger un elemento
    private double probabilidad;//probabilidad simple

    public ProbabilidadSimple() 
    {
        posibilidadEscoger = 0;
        probabilidad = 0.0;
    }//fin constructor

    public int getPosibilidadEscoger() {
        return posibilidadEscoger;
    }

    public void setPosibilidadEscoger(int posibilidadEscoger) {
        this.posibilidadEscoger = posibilidadEscoger;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }
    
    
    @Override
     public void mostrarImagen() 
    {
        JOptionPane.showMessageDialog(null, "", "ProbabilidadSimple",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/ProbabilidadSimple.png"));
    }//fin metodo mostrarImagen
     
    @Override
     public void pedirDatos()
    {
        cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad totoal de elementos:"));
        
        posibilidadEscoger = Integer.parseInt(JOptionPane.showInputDialog("Digite la posibilidad de escoger un elemento diferente:"));
        
    }//fin metodo pedirDatos()
     
     public void calcProbabilidadSimple()
     {
         probabilidad = cantidadElementos/posibilidadEscoger;
         DecimalFormat df = new DecimalFormat("0.00");
         
         mensaje = "Cantidad total de elementos: "+cantidadElementos+"\n"
                 + "Cantidad de posibles elemntos: "+posibilidadEscoger+"\n"
                 + "Probabilidad Simple: "+df.format(probabilidad)+"%";
     }//fin metodo calcProbabilidadSimple()
     
    @Override
     public void resultado()
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()
     
}//fin clase ProbabilidadSimple