package Estadistica;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Sumatoria 
{
    protected int n;
    protected int i;
    protected int x;

    public Sumatoria() 
    {
        n = 0;
        i = 0;
        x = 0;
    }
    
    public int calcularSumatoria ()
    {
        int suma = 0;
        
        while (i<n)
        {
            suma+= x;
            i++;
        }
        
        return suma;
    }
}
