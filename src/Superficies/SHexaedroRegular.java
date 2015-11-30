package Superficies;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class SHexaedroRegular extends SFigura {

    private double lado;
    private double superficieLateral;

    public SHexaedroRegular() {
        lado = 0.0;
        figura = "HexaedroRegular";
    }//fin constructor

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void pedirDatos() {
        //Se pide la medida del lado y se valida
        lado = fallo.doubleValidarExcepciones("Digite el valor del lado:", "Hexaedro Regular");

    }//fin metodo pedirDator()

    @Override
    public void calcSuperficie() {
        superficieLateral = 4 * Math.pow(lado, 2);

        superficie = 6 * Math.pow(lado, 2);

        mensaje = "Lado: " + lado + "\n"
                + "Superficie Lateral: " + decimalFormat.format(superficieLateral) + "\n"
                + "Superficie Total: " + decimalFormat.format(superficie);
    }//fin metodo calcSuperficie()

}//fin clase SHexaedroRegular
