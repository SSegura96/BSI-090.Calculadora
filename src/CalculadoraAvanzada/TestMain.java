package CalculadoraAvanzada;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez & Sergio Segura
 */
public class TestMain {

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            //Variable para alamacenar el indice del vector con la respuesta del JOption
            int indice = 0;

            Object[] botonesMenuCalcu = {"Áreas de figuras planas(2D).",
                "Perímetros de figuras planas (2D).", "Estadística.",
                "Probabilidades y combinaciones.", "Superficies.", "Volúmenes.",
                "Vectores y Matrices.", "Conjeturas."};

            String elementoMenu1 = JOptionPane.showInputDialog(null,
                    "Digite el codigo de la opcion desesada: \n", "Calculadora Avanzada",
                    JOptionPane.PLAIN_MESSAGE, null, botonesMenuCalcu,
                    botonesMenuCalcu[0]).toString();

            //Ciclo que obtiene el indice para usarlo el switch
            for (int i = 0; i < botonesMenuCalcu.length; i++) {
                if (botonesMenuCalcu[i] == elementoMenu1) {
                    indice = i;
                    i = botonesMenuCalcu.length;
                }//fin if
            }//fin for

            switch (indice) {
                case 0: {

                    Object[] botonesMenuAreaFigPlanas = {"Circulo.", "Triangulo.",
                        "Cuadrado.", "Rectángulo.", "Rombo.", "Trapecio.", "Romboide.",
                        "Polígono Regular"};

                    String menuFigPlanas = JOptionPane.showInputDialog(null,
                            "Digite el codigo de la figura deseada:\n", "Areas Figuras Planas(2D)",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuAreaFigPlanas,
                            botonesMenuAreaFigPlanas[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuAreaFigPlanas.length; i++) {
                        indice = 0;
                        if (botonesMenuAreaFigPlanas[i] == menuFigPlanas) {
                            indice = i;
                            i = botonesMenuAreaFigPlanas.length;
                        }//fin if
                    }//fin for
                }//fin case 0

                case 1: {
                    Object[] botonesMenuPerimFigPlanas = {"Circulo.", "Triangulo.",
                        "Cuadrado.", "Rectángulo.", "Rombo.", "Trapecio.", "Romboide.",
                        "Polígono Regular"};

                    String menuFigPlanas = JOptionPane.showInputDialog(null,
                            "Digite el codigo de la figura deseada:\n", "Perimetros Figuras Planas(2D)",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuPerimFigPlanas,
                            botonesMenuPerimFigPlanas[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuPerimFigPlanas.length; i++) 
                    {
                        indice = 0;
                        if (botonesMenuPerimFigPlanas[i] == menuFigPlanas) 
                        {
                            indice = i;
                            i = botonesMenuPerimFigPlanas.length;
                        }//fin if
                    }//fin for
                }//fin case 1
        }//fin switch menuCalcu
    }//fin while

    System.exit (0);
    }//fin main
}//fin class TestMain
