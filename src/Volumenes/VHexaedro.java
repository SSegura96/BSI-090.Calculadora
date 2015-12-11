package Volumenes;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class VHexaedro extends VFigura {

    private double lado;

    public VHexaedro() {
        lado = 0;
        figura = "Hexaedro";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void pedirDatos() {
        lado = fallo.doubleValidarExcepciones("Digite el valor del lado", figura);
    }

    @Override
    public void calcVolumen() {
        volumen = Math.pow(lado, 3);

        mensaje = "Lado: " + lado + "\n"
                + "Volumen " + volumen;
    }
}
