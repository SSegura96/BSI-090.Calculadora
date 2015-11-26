package Estadistica;

import CalculadoraAvanzada.ManejoErrores;

/**
 *
 * @author Sergio Segura Vidal
 */
public class abEstadistica 
{
    //Variables de uso exclusivo para la validaciones en el codigo
    boolean todoBien;
    String tituloError;
    int tipoError;
    int imgError;
    ManejoErrores fallo = new ManejoErrores();
    //Se utiliza esta clase generica para llamar a los errores personalizados.

    public abEstadistica() 
    {
        todoBien = true;
        tituloError = "";
        tipoError = 0;
        imgError = 0;
    }

    public boolean isTodoBien() {
        return todoBien;
    }

    public void setTodoBien(boolean todoBien) {
        this.todoBien = todoBien;
    }

    public String getTituloError() {
        return tituloError;
    }

    public void setTituloError(String tituloError) {
        this.tituloError = tituloError;
    }

    public int getTipoError() {
        return tipoError;
    }

    public void setTipoError(int tipoError) {
        this.tipoError = tipoError;
    }

    public int getImgError() {
        return imgError;
    }

    public void setImgError(int imgError) {
        this.imgError = imgError;
    }

    public ManejoErrores getFallo() {
        return fallo;
    }

    public void setFallo(ManejoErrores fallo) {
        this.fallo = fallo;
    }
    
}
