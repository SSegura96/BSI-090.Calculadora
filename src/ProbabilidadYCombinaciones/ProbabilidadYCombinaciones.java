package ProbabilidadYCombinaciones;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public abstract class ProbabilidadYCombinaciones implements IProbabilidadYCombinaciones
{
    protected String mensaje;
    protected int cantidadElementos;

    public ProbabilidadYCombinaciones() 
    {
        mensaje = "";
        cantidadElementos = 0;
    }//fin constructor

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }
    
}//fin clase ProbabilidadYCombinaciones