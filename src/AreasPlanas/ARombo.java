package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class ARombo extends Figura 
{
    double diagMayor;
    double diagMenor;

    public ARombo() 
    {
        diagMayor = 0;
        diagMenor = 0;
    }//fin constructor

    @Override
    public void calcArea ()
    {
        area = (diagMayor*diagMenor)/2;
    }//fin metodo calcArea ()

    public double getDiagMayor() 
    {
        return diagMayor;
    }

    public void setDiagMayor(double diagMayor) 
    {
        this.diagMayor = diagMayor;
    }

    public double getDiagMenor() 
    {
        return diagMenor;
    }

    public void setDiagMenor(double diagMenor) 
    {
        this.diagMenor = diagMenor;
    }
    
}//fin clase ARombo
