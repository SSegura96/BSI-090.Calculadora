package Volumenes;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class VCilindro extends VFigura {

    private double radio;
    private double altura;

    public VCilindro() {
        radio = 0;
        altura = 0;
        figura = "Cilindro";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void pedirDatos() {
        radio = fallo.doubleValidarExcepciones("Digite el valor del radio", figura);
        altura = fallo.doubleValidarExcepciones("Digite el valor de la altura", figura);
    }

    @Override
    public void calcVolumen() {
        volumen = (Math.PI * Math.pow(radio, 2) * altura);

        mensaje = "Radio: " + radio + "\n"
                + "Altura: " + altura + "\n"
                + "Volumen: " + volumen;
    }
}
