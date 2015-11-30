package ProbabilidadYCombinaciones;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Permutacion extends ProbabilidadYCombinaciones {

    private int grupoElementos;
    private double permutacion;

    public Permutacion() {
        grupoElementos = 0;
        permutacion = 0;
        imagen = "Permutacion";
    }//fin constructor

    public int getGrupoElementos() {
        return grupoElementos;
    }

    public void setGrupoElementos(int grupoElementos) {
        this.grupoElementos = grupoElementos;
    }

    public double getPermutacion() {
        return permutacion;
    }

    public void setPermutacion(int permutacion) {
        this.permutacion = permutacion;
    }

    @Override
    public void pedirDatos() {

        cantidadElementos = fallo.intValidarExcepciones("Digite la cantidad total de elementos:", imagen);

        grupoElementos = fallo.intValidarExcepciones("Digite en grupos de cuanto"
                + " quiere agrupar los elementos", imagen);
    }//fin metodo pedirDatos()

    public void calcPermutacion() {
        //Se saca el factorial de ambos elementos para generar la formula
        Factorial facNumElementos = new Factorial();
        facNumElementos.setNumero(cantidadElementos);

        Factorial facOperacion = new Factorial();
        facOperacion.setNumero(cantidadElementos - grupoElementos);

        permutacion = facNumElementos.calcFactorial() / facOperacion.calcFactorial();

        mensaje = "Cantidad de Elementos: " + cantidadElementos + "\n"
                + "Grupos de elementos: " + grupoElementos + "\n"
                + "Permutacion: " + permutacion;
    }//fin metodo calcPermutacion()
}//fin clase Permutacion
