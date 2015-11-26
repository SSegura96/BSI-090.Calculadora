/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estadistica;

import CalculadoraAvanzada.ManejoErrores;

/**
 *
 * @author Sergio Segura Vidal
 */
public class abEstadistica 
{
    //Variables de uso exclusivo para la validaciones en el codigo
    String tituloError;
    int tipoError;
    int imgError;
    ManejoErrores fallo = new ManejoErrores();
    //Se utiliza esta clase generica para llamar a los errores personalizados.

    public abEstadistica() 
    {
        tituloError = "";
        tipoError = 0;
        imgError = 0;
    }
}
