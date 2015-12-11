package ProbabilidadYCombinaciones;

/**
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Combinatoria extends ProbabilidadYCombinaciones {

    private double numElementos;
    private double numSubgrupo;
    private double combinatora;

    public Combinatoria() {
        numElementos = 0.0;
        numSubgrupo = 0.0;
        combinatora = 0.0;
        imagen = "Combinatoria";
    }

    public double getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(double numElementos) {
        this.numElementos = numElementos;
    }

    public double getNumSubgrupo() {
        return numSubgrupo;
    }

    public void setNumSubgrupo(double numSubgrupo) {
        this.numSubgrupo = numSubgrupo;
    }

    public double getCombinatora() {
        return combinatora;
    }

    public void setCombinatora(double combinatora) {
        this.combinatora = combinatora;
    }

    @Override
    public void pedirDatos() throws NumberFormatException {
        numElementos = fallo.doubleValidarExcepciones("Digite el numero de elementos", imagen);

        numSubgrupo = fallo.doubleValidarExcepciones("Digite el elemetos en el subgrupo", imagen);
    }

    public double calcCombinatoria() {
        int operacion = 1;
        int numTemp = (int) numElementos;
        int i = (int) numSubgrupo;

        Factorial facNumElementos = new Factorial();
        Factorial facNumGrupo = new Factorial();

        facNumElementos.setNumero((int) numElementos);
        facNumGrupo.setNumero((int) numSubgrupo);

        while (i != 0) {
            operacion *= numTemp--;

            i--;
        }

        combinatora = operacion / facNumGrupo.calcFactorial();

        mensaje = "Numero de elementos: " + numElementos + "\n"
                + "Numero de elementos del sub grupo: " + numSubgrupo + "\n"
                + "Numero de posibles combinaciones: " + combinatora;

        return combinatora;
    }
}
