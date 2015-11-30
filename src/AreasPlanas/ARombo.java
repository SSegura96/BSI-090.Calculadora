package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ARombo extends AFigura {

    private double diagMayor;
    private double diagMenor;

    public ARombo() {
        diagMayor = 0;
        diagMenor = 0;
        figura = "Rombo";
    }//fin constructor

    public double getDiagMayor() {
        return diagMayor;
    }

    public void setDiagMayor(double diagMayor) {
        this.diagMayor = diagMayor;
    }

    public double getDiagMenor() {
        return diagMenor;
    }

    public void setDiagMenor(double diagMenor) {
        this.diagMenor = diagMenor;
    }

    @Override
    public void pedirDatos() {
        diagMayor = fallo.doubleValidarExcepciones("Digite el valos de la Diagonal Mayor:", figura);

        diagMenor = fallo.doubleValidarExcepciones("Digite el valos de la Diagonal Mayor:", figura);
    }//fin clase pedirDatos

    @Override
    public double calcArea() {
        area = (diagMayor * diagMenor) / 2;

        area = enmascararDouble(area);

        mensaje = "Diagonal Mayor: " + diagMayor + "\n"
                + "Diagonal Menor: " + diagMenor + "\n"
                + "Area: " + area;

        return area;
    }//fin metodo calcArea ()

}//fin clase ARombo
