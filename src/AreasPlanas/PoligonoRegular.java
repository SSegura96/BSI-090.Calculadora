package AreasPlanas;

/**
 * @author Sergio Segura Vidal
 */

public class PoligonoRegular 
{
    private double calcularApotema()
    {
        double angRadianes;
        double angCentral;
        double apotema;
        int numLados = 0;
        
        //se saca el algulo central y lo convertimos a radianes para poder sacar la tangencia.
        
        angCentral = 360/numLados;
        angRadianes = Math.toRadians(angCentral);
        double medidaLado = 0;
        
        //Se saca el apotema: Lado/2*tan(angRadianes/2)

        apotema = medidaLado/(2*Math.tan(angRadianes/2));
        return apotema;
    }//fin calcularApotema()
}
