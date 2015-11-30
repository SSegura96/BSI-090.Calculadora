package Superficies;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SEsfera extends SFigura {

    private double radio;

    public SEsfera() {
        radio = 0.0;
        figura = "Esfera";
    }//fin constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void pedirDatos() {
        //Se pide la medida del radio y se valida
        radio = fallo.doubleValidarExcepciones("Digite el valor del radio:", figura);

    }//fin metodo pedirDatos()

    @Override
    public void calcSuperficie() {
        superficie = 4 * Math.PI * Math.pow(radio, 2);

        mensaje = "Radio: " + radio + "\n"
                + "Superficie: " + decimalFormat.format(superficie);
    }//fin metodo calcSuperficie()

}//fin clase SEsfera
