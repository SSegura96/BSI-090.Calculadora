package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SumaVectorial extends ArregloUnidimensional
{
    private double []sumaV;

    public SumaVectorial() 
    {
        sumaV = new double[0];
    }//fin constructor

    public double[] getSumaV() {
        return sumaV;
    }

    public void setSumaV(double[] sumaV) {
        this.sumaV = sumaV;
    }
    
    
    @Override
    public void llenarVector() 
    {
        JOptionPane.showMessageDialog(null, "Llenar el primer vector vector[ ]");
        for (int i = 0; i < vector.length; i++) 
        {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato vector[" + i + "]"));
        }//fin primer for

        JOptionPane.showMessageDialog(null, "Llenar vector vector2[ ]");
        for (int j = 0; j < vector2.length; j++) 
        {
            vector2[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato vector2[" + j + "]"));
        }//fin segundo for
    }//fin metodo llenarVector()
    
    @Override
    public void pedirDatos()
    {
        tamanno = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del primer vector:"));
        vector = new double[tamanno];
        
        tamanno = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del segundo vector:"));
        vector2 = new double[tamanno];
        
        llenarVector();
    }//fin metodo pedirDatos()
    
    @Override
    public String recorrerVector(double[] vector1)
    {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) 
        {
            dato += ""+vector1[i]+", ";
        }//foin primer for
        
        return dato;
        
    }//fin metodo recorrerVector
    
    public void calcSumaV()
    {
        sumaV = new double[vector.length];
        
        for (int i = 0; i < vector.length; i++) 
        {
            sumaV[i] = vector[i]+vector2[i];
        }//fin primer for
        
        mensaje = "Vector[ "+vector.length+" ]\n"
                + "Vector2[ "+vector2.length+" ]\n"
                + "Sumas de las posiciones:\n"+recorrerVector(sumaV);
    }//fin metodo caclSumaV
}//fin clase SumaVectorial