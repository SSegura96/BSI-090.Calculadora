package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ACirculo extends AFigura 
{

    private double radio;

    public ACirculo() 
    {
        radio = 0;
        figura = "Circulo";
    }//fin constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public void pedirDatos() 
    {
        radio = fallo.doubleValidarExcepciones("Digite el valor del radio:", figura);
    }//fin clase pedirDatos

    @Override
    public double calcArea() 
    {
        area = Math.PI * Math.pow(radio, 2);

        area = enmascararDouble(area);
        
        mensaje = "Radio: " + radio + "\n"
                + "Area: " + area;
        
        return area;
    }//fin metodo calcArea ()

}//fin clase ACirculo
