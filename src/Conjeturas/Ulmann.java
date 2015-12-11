package Conjeturas;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Ulmann extends AbCalculo {

    double numeroIngresado;
    double resultado;

    public Ulmann() {
        numeroIngresado = 0;
        resultado = 0;
        mensaje = "";
        figura = "Ulmann";
    }

    @Override
    public void pedirDatos() {
        numeroIngresado = fallo.doubleValidarExcepciones("Digite un número", figura);
    }

    public void calcUlmann() {
        resultado = numeroIngresado;
        mensaje = "El resultado es: \n" + numeroIngresado + "";
        while (resultado != 1) {
            if ((resultado % 2) == 0) {
                resultado /= 2;
            } else {
                resultado = (resultado * 3) + 1;
            }

            mensaje += "\n" + resultado;
        }
    }

}
