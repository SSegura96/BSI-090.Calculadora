package Vectores;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class VProductoVectorial extends VVector
{
    private int []procdutoV;

    public VProductoVectorial() 
    {
        procdutoV = new int [0];
    }//fin constructor

    public int[] getProcdutoV() {
        return procdutoV;
    }

    public void setProcdutoV(int[] procdutoV) {
        this.procdutoV = procdutoV;
    }
    
    
    @Override
    public void pedirDatos()
    {
        
    }//fin metodo pedirDatos()
     
    public void calcProductoV()
    {
        for (int i = 0; i < vector.length; i++) 
        {
            procdutoV[i] = vector[i]*vector2[i];
        }//fin primer for
    }//fin metodo caclProductoV
    
}//fin clase VProductoVectorial