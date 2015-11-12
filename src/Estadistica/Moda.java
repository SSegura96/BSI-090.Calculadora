package Estadistica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Moda {

    private int maximaVecesQueSeRepite;
    private double moda;
    private double vectorM[];
    private int tamanno;
    private String mensaje;

    public Moda() 
    {
        maximaVecesQueSeRepite = 0;
        moda = 0.0;
        vectorM = new double[0];
        tamanno = 0;
    }//fin constructor

    public int getMaximaVecesQueSeRepite() {
        return maximaVecesQueSeRepite;
    }

    public void setMaximaVecesQueSeRepite(int maximaVecesQueSeRepite) {
        this.maximaVecesQueSeRepite = maximaVecesQueSeRepite;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }

    public double[] getVectorM() {
        return vectorM;
    }

    public void setVectorM(double[] vectorM) {
        this.vectorM = vectorM;
    }

    public int getTamanno() {
        return tamanno;
    }

    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }
    
    public void mostrarImagen() {
        JOptionPane.showMessageDialog(null, "", "Moda",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/Moda.png"));
    }//fin metodo mostrarImagen
    
    public void llenarVector() 
    {
        JOptionPane.showMessageDialog(null, "Llenar el vector: vector[ ]");
        for (int i = 0; i < vectorM.length; i++) 
        {
            vectorM[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese dato de: vector[" + i + "]"));
        }//fin primer for
        
    }//fin metodo llenarVector()
    
    public void pedirDatos() 
    {
        tamanno = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño del vector:"));
        vectorM = new double[tamanno];
        
        llenarVector();
    }//fin metodo pedirDatos()
    
    public String recorrerVector(double[] vector1)
    {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) 
        {
            dato = ""+vector1[i]+", ";
        }//foin primer for
        
        return dato;
        
    }//fin metodo recorrerVector
    
    public void calcModa() 
    {
        for (int i = 0; i < vectorM.length; i++) 
        {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < vectorM.length; j++) 
            {
                if (vectorM[i] == vectorM[j]) 
                {
                    vecesQueSeRepite++;
                }//fin primer if
                
            }//fin segundo for
            if (vecesQueSeRepite > maximaVecesQueSeRepite) 
            {
                moda = vectorM[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }//fin segundo if
            
        }//fin primer for
        mensaje = "La moda: "+moda+"\n"
                + "Se repitio: "+maximaVecesQueSeRepite+"\n"
                + "Valores: "+recorrerVector(vectorM);
    }//fin metodo calcModa()
    
    public void resultado() {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()
    
}//fin clase Moda
