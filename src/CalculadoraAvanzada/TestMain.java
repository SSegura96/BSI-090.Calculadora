package CalculadoraAvanzada;

import javax.swing.JOptionPane;
import AreasPlanas.*;
import PerimetrosPlanos.*;

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
                "Vectores.", "Matrices.", "Conjeturas."};

            String elementoMenu1 = JOptionPane.showInputDialog(null,
                    "Seleccione el calculo desesado: \n", "Calculadora Avanzada",
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

                    String menuAreaFigPlanas = JOptionPane.showInputDialog(null,
                            "Seleccione la figura deseada:\n", "Areas Figuras Planas(2D)",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuAreaFigPlanas,
                            botonesMenuAreaFigPlanas[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuAreaFigPlanas.length; i++) {
                        indice = 0;
                        if (botonesMenuAreaFigPlanas[i] == menuAreaFigPlanas) {
                            indice = i;
                            i = botonesMenuAreaFigPlanas.length;
                        }//fin if
                    }//fin for

                    //Switch para el sudmenu
                    switch (indice)
                    {
                        //Circulo
                        case 0: 
                           ACirculo cir = new ACirculo ();
                           cir.mostrarImagen("Circulo");
                           cir.pedirDatos();
                           cir.calcArea();
                           cir.resultado();
                        break;
                        
                        //Triangulo
                        case 1: 
                            ATriangulo tri = new ATriangulo();
                            tri.mostrarImagen("Triangulo");
                            tri.pedirDatos();
                            tri.calcArea();
                            tri.resultado();
                        break;
                       
                        //Cuadrado
                        case 2: 
                            ACuadrado cua = new ACuadrado();
                            cua.mostrarImagen("Cuadrado");
                            cua.pedirDatos();
                            cua.calcArea();
                            cua.resultado();
                        break;
                       
                        //Rectangulo
                        case 3: 
                            ARombo rob1 = new ARombo();
                            rob1.mostrarImagen("Rectangulo");
                            rob1.pedirDatos();
                            rob1.calcArea();
                            rob1.resultado();
                        break;
                       
                        //Rombo
                        case 4: 
                            ARombo rob = new ARombo();
                            rob.mostrarImagen("Cuadadrado");
                            rob.pedirDatos();
                            rob.calcArea();
                            rob.resultado(); 
                        break;
                       
                        //Trapecio
                        case 5:
                        /*
                            ATrapecio trap = new ATrapecio();
                            trap.mostrarImagen("Cuadadrado");
                            trap.pedirDatos();
                            trap.calcArea();
                            trap.resultado();
                        */
                        break;
                      
                        //Romboide    
                        case 6:
                            ARomboide romb = new ARomboide();
                            romb.mostrarImagen("Romboide");
                            romb.pedirDatos();
                            romb.calcArea();
                            romb.resultado();
                        break;
                      
                        //Poligono regular
                        case 7:
                            APoligonoRegular pr = new APoligonoRegular();
                            pr.mostrarImagen("Romboide");
                            pr.pedirDatos();
                            pr.calcArea();
                            pr.resultado(); 
                        break;
                            
                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 0

                case 1: {
                    Object[] botonesMenuPerimFigPlanas = {"Circulo.", "Triangulo.",
                        "Cuadrado.", "Rectángulo.", "Rombo.", "Trapecio.", "Romboide.",
                        "Polígono Regular"};

                    String menuPerimFigPlanas = JOptionPane.showInputDialog(null,
                            "Seleccione la figura deseada:\n", "Perimetros Figuras Planas(2D)",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuPerimFigPlanas,
                            botonesMenuPerimFigPlanas[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuPerimFigPlanas.length; i++) {
                        indice = 0;
                        if (botonesMenuPerimFigPlanas[i] == menuPerimFigPlanas) {
                            indice = i;
                            i = botonesMenuPerimFigPlanas.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case 2: {

                            break;
                        }//fin segundo case 2

                        case 3: {

                            break;
                        }//fin segundo case 3

                        case 4: {

                            break;
                        }//fin segundo case 4

                        case 5: {

                            break;
                        }//fin segundo case 5

                        case 6: {

                            break;
                        }//fin segundo case 6

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 1

                case 2: {
                    Object[] botonesMenuEstadistica = {"Sumatoria.", "Moda.",
                        "Promedio.", "Mediana.", "Varianza.", "Desviacion Estandar."};

                    String menuEstadistica = JOptionPane.showInputDialog(null,
                            "Seleccione la formula deseada:\n", "Estadistica",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuEstadistica,
                            botonesMenuEstadistica[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuEstadistica.length; i++) {
                        indice = 0;
                        if (botonesMenuEstadistica[i] == menuEstadistica) {
                            indice = i;
                            i = botonesMenuEstadistica.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case 2: {

                            break;
                        }//fin segundo case 2

                        case 3: {

                            break;
                        }//fin segundo case 3

                        case 4: {

                            break;
                        }//fin segundo case 4

                        case 5: {

                            break;
                        }//fin segundo case 5

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 2

                case 3: {
                    Object[] botonesMenuProbComb = {"Factorial.", "Permutación.",
                        "Combinatoria.", "Probabilidad Simple."};

                    String menuProbComb = JOptionPane.showInputDialog(null,
                            "Seleccione la formula deseada:\n", "Probabilidades y Combinaciones",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuProbComb,
                            botonesMenuProbComb[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuProbComb.length; i++) {
                        indice = 0;
                        if (botonesMenuProbComb[i] == menuProbComb) {
                            indice = i;
                            i = botonesMenuProbComb.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case 2: {

                            break;
                        }//fin segundo case 2

                        case 3: {

                            break;
                        }//fin segundo case 3

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 3

                case 4: {
                    Object[] botonesMenuSuperficies = {"Esfera.", "Cilindro.",
                        "Cono.", "Hexaedro Regular.", "Prisma.", "Paralelipipedo.",
                        "Piramide Regular."};

                    String menuSuperficies = JOptionPane.showInputDialog(null,
                            "Seleccione la forma deseada:\n", "Superficies",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuSuperficies,
                            botonesMenuSuperficies[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuSuperficies.length; i++) {
                        indice = 0;
                        if (botonesMenuSuperficies[i] == menuSuperficies) {
                            indice = i;
                            i = botonesMenuSuperficies.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case 2: {

                            break;
                        }//fin segundo case 2

                        case 3: {

                            break;
                        }//fin segundo case 3

                        case 4: {

                            break;
                        }//fin segundo case 4

                        case 5: {

                            break;
                        }//fin segundo case 5

                        case 6: {

                            break;
                        }//fin segundo case 6

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 4

                case 5: {
                    Object[] botonesMenuVolumenes = {"Esfera.", "Cilindro.",
                        "Cono.", "Hexaedro Regular.", "Prisma.", "Paralelipipedo.",
                        "Piramide Regular."};

                    String menuVolumenes = JOptionPane.showInputDialog(null,
                            "Seleccione la forma deseada:\n", "Volumenes",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuVolumenes,
                            botonesMenuVolumenes[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuVolumenes.length; i++) {
                        indice = 0;
                        if (botonesMenuVolumenes[i] == menuVolumenes) {
                            indice = i;
                            i = botonesMenuVolumenes.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case 2: {

                            break;
                        }//fin segundo case 2

                        case 3: {

                            break;
                        }//fin segundo case 3

                        case 4: {

                            break;
                        }//fin segundo case 4

                        case 5: {

                            break;
                        }//fin segundo case 5

                        case 6: {

                            break;
                        }//fin segundo case 6

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 5

                case 6: {
                    Object[] botonesMenuVector = {"Escalar.", "Suma.",
                        "Producto."};

                    String menuVector = JOptionPane.showInputDialog(null,
                            "Seleccione la operacion deseada:\n", "Vector",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuVector,
                            botonesMenuVector[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuVector.length; i++) {
                        indice = 0;
                        if (botonesMenuVector[i] == menuVector) {
                            indice = i;
                            i = botonesMenuVector.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case 2: {

                            break;
                        }//fin segundo case 2

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 6

                case 7: {
                    Object[] botonesMenuMatriz = {"Escalar.", "Suma.",
                        "Producto."};

                    String menuMatriz = JOptionPane.showInputDialog(null,
                            "Seleccione la operacion deseada:\n", "Matriz",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuMatriz,
                            botonesMenuMatriz[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuMatriz.length; i++) {
                        indice = 0;
                        if (botonesMenuMatriz[i] == menuMatriz) {
                            indice = i;
                            i = botonesMenuMatriz.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case 2: {

                            break;
                        }//fin segundo case 2

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 7

                case 8: {
                    Object[] botonesMenuConjeturas = {"Ulmann.", "Pene."};

                    String menuConjeturas = JOptionPane.showInputDialog(null,
                            "Seleccione la formula deseada:\n", "Conjeturas",
                            JOptionPane.PLAIN_MESSAGE, null, botonesMenuConjeturas,
                            botonesMenuConjeturas[0]).toString();

                    //Ciclo que obtiene el indice para usarlo el switch
                    for (int i = 0; i < botonesMenuConjeturas.length; i++) {
                        indice = 0;
                        if (botonesMenuConjeturas[i] == menuConjeturas) {
                            indice = i;
                            i = botonesMenuConjeturas.length;
                        }//fin if
                    }//fin for

                    switch (indice) {
                        case 0: {

                            break;
                        }//fin segundo case 0

                        case 1: {

                            break;
                        }//fin segundo case 1

                        case JOptionPane.CLOSED_OPTION: {
                            salir = true;
                            break;
                        }//fin case JOptionPane.CLOSED_OPTION
                    }//fin segundo switch
                    break;
                }//fin case 8

                case JOptionPane.CLOSED_OPTION: {
                    salir = true;
                    break;
                }//fin case JOptionPane.CLOSED_OPTION

            }//fin switch menuCalcu
        }//fin while
        System.exit(0);
    }//fin main
}//fin class TestMain
