package AreasPlanas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class ARomboide extends AFigura {

    private double base;
    private double altura;

    public ARomboide() {
        base = 0;
        altura = 0;
        figura = "Romboide";
    }//fin constructor

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void pedirDatos() {
        base = fallo.doubleValidarExcepciones("Digite el valor de la base:", figura);

        altura = fallo.doubleValidarExcepciones("Digite el valor de la altura:", figura);
    }//fin clase pedirDatos

    @Override
    public double calcArea() {
        area = base * altura;

        area = enmascararDouble(area);

        mensaje = "Base: " + base + "\n"
                + "Altura: " + altura + "\n"
                + "Area: " + area;
        return area;
    }//fin metodo calcArea ()

}//fin clase ARomboide
