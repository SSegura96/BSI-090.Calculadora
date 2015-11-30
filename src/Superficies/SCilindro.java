package Superficies;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SCilindro extends SFigura {

    private double altura;
    private double radio;

    public SCilindro() {
        altura = 0.0;
        radio = 0.0;
        figura = "Cilindro";
    }//fin constructor

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void pedirDatos() {
        
        altura = fallo.doubleValidarExcepciones("Digite el valor de la altura:", figura);

        radio = fallo.doubleValidarExcepciones("Digite el valor del radio:", figura);

    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() {
        
        superficie = 2 * Math.PI * radio * (altura + radio);

        mensaje = "Altura: " + altura + "\n"
                + "Radio: " + radio + "\n"
                + "Superficie: " + decimalFormat.format(superficie);
    }//fin metodo calcSuperficie()

}//fin clase SCilindro
