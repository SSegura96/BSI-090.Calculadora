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

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
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
