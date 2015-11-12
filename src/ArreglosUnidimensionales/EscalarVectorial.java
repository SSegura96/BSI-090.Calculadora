package ArreglosUnidimensionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class EscalarVectorial extends ArregloUnidimensional
{
    private double []escalarV;
    private double escalar;
    public EscalarVectorial() 
    {
        escalarV = new double[0];
        escalar = 0.0;
    }//fin constructor

    public double[] getEscalarV() {
        return escalarV;
    }

    public void setEscalarV(double[] escalarV) {
        this.escalarV = escalarV;
    }

    public double getEscalar() {
        return escalar;
    }

    public void setEscalar(double escalar) {
        this.escalar = escalar;
    }

    
    @Override
    public void llenarVector() 
    {
        JOptionPane.showMessageDialog(null, "Llenar el primer vector vector[ ]");
        for (int i = 0; i < vector.length; i++) 
        {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato vector[" + i + "]"));
        }//fin primer for
        
    }//fin metodo llenarVector()
    
    @Override
    public void pedirDatos()
    {
        tamanno = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del primer vector:"));
        vector = new double[tamanno];
        
        escalar = Double.parseDouble(JOptionPane.showInputDialog("Digite el escalar:"));
        
        llenarVector();
    }//fin metodo pedirDatos()
    
    @Override
    public String recorrerVector(double[] vector1)
    {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) 
        {
            dato = ""+vector1[i]+", ";
        }//foin primer for
        
        return dato;
        
    }//fin metodo recorrerVector
    
    public void calcProductoV()
    {
        for (int i = 0; i < vector.length; i++) 
        {
            escalarV[i] = vector[i]*escalar;
        }//fin primer for
        
        mensaje = "Vector[ "+vector.length+" ]\n"
                + "Vector2[ "+vector2.length+" ]\n \n"
                + "Escalar de las posiciones:\n"+recorrerVector(escalarV);
    }//fin metodo caclProductoV
}//fin clase EscalarVectorial