package AreasPlanas;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ATriangulo extends AFigura {

    private double medidaLado;

    public ATriangulo() {
        medidaLado = 0.0;
        figura = "Triangulo";
    }

    public double getMedidaLado() {
        return medidaLado;
    }

    public void setMedidaLado(double medidaLado) {
        this.medidaLado = medidaLado;
    }

    @Override
    public void pedirDatos() {
        medidaLado = fallo.doubleValidarExcepciones("Digite la medida del lado:", figura);
    }//fin clase pedirDatos@Override

    @Override
    public double calcArea() {
        //Formula utilizada: 
        area = ((Math.sqrt(3)) * Math.pow(medidaLado, 2)) / 4;

        area = enmascararDouble(area);

        mensaje = "La media del lado es: " + medidaLado + "\n"
                + "El area es: " + area;
        return area;
    }//fin metodo calcArea()

}//fin clase ATriangulo
