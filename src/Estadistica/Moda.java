package Estadistica;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Moda extends abEstadistica {

    private int maximaVecesQueSeRepite;
    private double moda;
    private double[] vectorModa;
    private double tamanno;

    public Moda() {
        maximaVecesQueSeRepite = 0;
        moda = 0.0;
        vectorModa = new double[0];
        tamanno = 0.0;
        titulo = "Moda";
    }//fin constructor

    public int getMaximaVecesQueSeRepite() {
        return maximaVecesQueSeRepite;
    }

    public void setMaximaVecesQueSeRepite(int maximaVecesQueSeRepite) {
        this.maximaVecesQueSeRepite = maximaVecesQueSeRepite;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }

    public double[] getVectorModa() {
        return vectorModa;
    }

    public void setVectorModa(double[] vectorModa) {
        this.vectorModa = vectorModa;
    }

    public double getTamanno() {
        return tamanno;
    }

    public void setTamanno(double tamanno) {
        this.tamanno = tamanno;
    }

    public void llenarVector() {
        for (int i = 0; i < vectorModa.length; i++) {
            //Se pide llenar el vector
            vectorModa[i] = fallo.doubleValidarExcepciones("Ingrese el dato "
                    + "#" + (i + 1) + " :", titulo);
        }//fin primer for
    }//fin metodo llenarVector()

    public void pedirDatos() {
        
        tamanno = fallo.doubleValidarExcepciones("Digite la cantidad de numeros "
                + "que va a ingresar:", titulo);
        
        vectorModa = new double[ (int) tamanno];

        llenarVector();
    }//fin metodo pedirDatos()

    public String recorrerVector(double[] vector1) {
        String dato = "";
        for (int i = 0; i < vector1.length; i++) {
            dato += "" + vector1[i] + ", ";
        }//foin primer for

        return dato;

    }//fin metodo recorrerVector

    public void calcModa() {

        for (int i = 0; i < vectorModa.length; i++) {

            int vecesQueSeRepite = 0;

            for (int j = 0; j < vectorModa.length; j++) {

                if (vectorModa[i] == vectorModa[j]) {
                    vecesQueSeRepite++;
                }//fin primer if

            }//fin segundo for

            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                moda = vectorModa[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }//fin segundo if

        }//fin primer for

        mensaje = "La moda: " + moda + "\n"
                + "Se repitio: " + maximaVecesQueSeRepite + "\n"
                + "Valores: " + recorrerVector(vectorModa);
    }//fin metodo calcModa()
}//fin clase Moda
