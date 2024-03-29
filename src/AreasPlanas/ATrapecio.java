package AreasPlanas;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ATrapecio extends AFigura {

    private double baseMayor;
    private double baseMenor;
    private double altura;

    public ATrapecio() {
        baseMayor = 0.0;
        baseMenor = 0.0;
        altura = 0.0;
        figura = "Trapecio";
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void pedirDatos() {
        baseMayor = fallo.doubleValidarExcepciones("Digite el valor de la Base Mayor:", figura);

        baseMenor = fallo.doubleValidarExcepciones("Digite el valor de la Base Menor:", figura);

        altura = fallo.doubleValidarExcepciones("Digite el valor de la altura:", figura);
    }//fin metodo pedirDatos()

    @Override
    public double calcArea() {
        area = ((baseMayor + baseMenor) * altura) / 2;

        area = enmascararDouble(area);

        mensaje = "Base Mayor: " + baseMayor + "\n"
                + "Base Menor: " + baseMenor + "\n"
                + "Altura: " + altura + "\n"
                + "Area: " + area;
        return area;
    }//fin metodo calcArea()

}//fin clase Atrapecio
