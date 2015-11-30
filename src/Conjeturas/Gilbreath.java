package Conjeturas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */
public class Gilbreath extends AbCalculo {

    //LinkedList para controlar los primos ingresados por el usario
    private LinkedList<Integer> primos = new LinkedList();
    //Estas siguientes son para mostrar los renglones de la formula en un metodo mas abajo
    private LinkedList<Integer> renglon2 = new LinkedList();
    private LinkedList<Integer> renglon3 = new LinkedList();
    private LinkedList<Integer> renglon4 = new LinkedList();
    private LinkedList<Integer> renglon5 = new LinkedList();
    private LinkedList<Integer> renglon6 = new LinkedList();
    private LinkedList<Integer> renglon7 = new LinkedList();
    private LinkedList<Integer> renglon8 = new LinkedList();
    private LinkedList<Integer> renglon9 = new LinkedList();
    private LinkedList<Integer> renglonFantasma = new LinkedList();
    //Cantidad de numeros de la LinkedList
    private int tamannoLinkedList;

    public Gilbreath() {
        this.tamannoLinkedList = 0;
        figura = "Gilbreath";
    }//fin constructor

    public LinkedList<Integer> getPrimos() {
        return primos;
    }

    public void setPrimos(LinkedList<Integer> primos) {
        this.primos = primos;
    }

    public LinkedList<Integer> getRenglon2() {
        return renglon2;
    }

    public void setRenglon2(LinkedList<Integer> renglon2) {
        this.renglon2 = renglon2;
    }

    public LinkedList<Integer> getRenglon3() {
        return renglon3;
    }

    public void setRenglon3(LinkedList<Integer> renglon3) {
        this.renglon3 = renglon3;
    }

    public LinkedList<Integer> getRenglon4() {
        return renglon4;
    }

    public void setRenglon4(LinkedList<Integer> renglon4) {
        this.renglon4 = renglon4;
    }

    public LinkedList<Integer> getRenglon5() {
        return renglon5;
    }

    public void setRenglon5(LinkedList<Integer> renglon5) {
        this.renglon5 = renglon5;
    }

    public LinkedList<Integer> getRenglon6() {
        return renglon6;
    }

    public void setRenglon6(LinkedList<Integer> renglon6) {
        this.renglon6 = renglon6;
    }

    public LinkedList<Integer> getRenglon7() {
        return renglon7;
    }

    public void setRenglon7(LinkedList<Integer> renglon7) {
        this.renglon7 = renglon7;
    }

    public LinkedList<Integer> getRenglon8() {
        return renglon8;
    }

    public void setRenglon8(LinkedList<Integer> renglon8) {
        this.renglon8 = renglon8;
    }

    public LinkedList<Integer> getRenglon9() {
        return renglon9;
    }

    public void setRenglon9(LinkedList<Integer> renglon9) {
        this.renglon9 = renglon9;
    }

    public LinkedList<Integer> getRenglonFantasma() {
        return renglonFantasma;
    }

    public void setRenglonFantasma(LinkedList<Integer> renglonFantasma) {
        this.renglonFantasma = renglonFantasma;
    }

    public int getTamannoLinkedList() {
        return tamannoLinkedList;
    }

    public void setTamannoLinkedList(int tamannoLinkedList) {
        this.tamannoLinkedList = tamannoLinkedList;
    }

    public boolean esPrimo(int numero) {
        int aux;
        for (int cont = 2; cont < numero; cont++) {
            aux = numero % cont;
            if (aux == 0) {
                return false;
            }//fin if
        }//fin for
        return true;
    }//fin metodo esPrimo(int numero)

    @Override
    public void pedirDatos() {
        int contador = 0;//solo lleva la cuenta en el msj a pantalla
        int contadorPrimos = 0;//lleva la cuenta de los valores para unsar la variable de clase tamannoLinkedList
        int num = 0;//almacena temporalmente el numero a evaluar

        do {
            tamannoLinkedList = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite la cantidad de numeros que va a ingresar:", figura,
                    JOptionPane.INFORMATION_MESSAGE));
            contadorPrimos = tamannoLinkedList;

            //se valida que el tamaño no sea invalido
            if (tamannoLinkedList == 0 || tamannoLinkedList == 1 || tamannoLinkedList > 10) {
                fallo.seleccionarMensaje(3, "Aviso", 2);
            }//fin if

        } while (tamannoLinkedList == 0 || tamannoLinkedList == 1 || tamannoLinkedList > 10);

        //Se alamacenan los numeros primos en la LinkedList
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un "
                    + "numero primo:\n \t \t Valor #" + (contador + 1) + " de "
                    + tamannoLinkedList, figura, JOptionPane.INFORMATION_MESSAGE));

            //se evalua que el numero sea primo
            if (esPrimo(num)) {
                primos.addLast(num);
                contadorPrimos--;
                contador++;
            }//fin if
            else {
                fallo.seleccionarMensaje(2, "Aviso", 2);
            }//fin else

        } while (contadorPrimos > 0);//fin do-while

    }//fin metodo pedirDatos()

    public String cargarNumeros(LinkedList<Integer> lista) {
        ArrayList lista2 = new ArrayList(lista);

        Iterator it = lista2.iterator();

        String renglon = "";

        while (it.hasNext()) {
            renglon += it.next() + " - ";
        }//fin while

        renglon = renglon.substring(0, renglon.length() - 2);

        return renglon;
    }//fin metodo cargarNumeros(LinkedList <Integer> lista)

    public String cargarRenglones(LinkedList<Integer> lista, LinkedList<Integer> lista2) {

        String renglon = "";
        int resultado;

        for (int indice = 0; indice < lista.size() - 1; indice++) {
            resultado = (lista.get(indice) - lista.get(indice + 1));
            resultado = Math.abs(resultado);
            lista2.addLast(resultado);
            renglon += resultado + " - ";
        }//fin for

        renglon = renglon.substring(0, renglon.length() - 2);

        return renglon;
    }//fin metodo cargarReglon()

    public void calcGilbreath() {
        //Depende del tamaño que se digite entra en el switch
        switch (tamannoLinkedList) {
            //si solo se digitan dos numeros
            case 2: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2);
                break;
            }//fin case 2

            //si solo se digitan 3
            case 3: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3);
                break;
            }//fin case 3

            //si solo se digitan 4
            case 4: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3) + "\n"
                        + "" + cargarRenglones(renglon3, renglon4);
                break;
            }//fin case 4

            //si solo se digitan 5
            case 5: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3) + "\n"
                        + "" + cargarRenglones(renglon3, renglon4) + "\n"
                        + "" + cargarRenglones(renglon4, renglon5);
                break;
            }//fin case 5

            //si solo se digitan 6
            case 6: {

                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3) + "\n"
                        + "" + cargarRenglones(renglon3, renglon4) + "\n"
                        + "" + cargarRenglones(renglon4, renglon5) + "\n"
                        + "" + cargarRenglones(renglon5, renglon6);
                break;
            }//fin case 6

            //si solo se digitan 7
            case 7: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3) + "\n"
                        + "" + cargarRenglones(renglon3, renglon4) + "\n"
                        + "" + cargarRenglones(renglon4, renglon5) + "\n"
                        + "" + cargarRenglones(renglon5, renglon6) + "\n"
                        + "" + cargarRenglones(renglon6, renglon7);
                break;
            }//fin case 7

            //si solo se digitan 8
            case 8: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3) + "\n"
                        + "" + cargarRenglones(renglon3, renglon4) + "\n"
                        + "" + cargarRenglones(renglon4, renglon5) + "\n"
                        + "" + cargarRenglones(renglon5, renglon6) + "\n"
                        + "" + cargarRenglones(renglon6, renglon7) + "\n"
                        + "" + cargarRenglones(renglon7, renglon8);
                break;
            }//fin case 8

            //si solo se digitan 9
            case 9: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3) + "\n"
                        + "" + cargarRenglones(renglon3, renglon4) + "\n"
                        + "" + cargarRenglones(renglon4, renglon5) + "\n"
                        + "" + cargarRenglones(renglon5, renglon6) + "\n"
                        + "" + cargarRenglones(renglon6, renglon7) + "\n"
                        + "" + cargarRenglones(renglon7, renglon8) + "\n"
                        + "" + cargarRenglones(renglon8, renglon9);
                break;
            }//fin case 9

            //si solo se digitan 10
            case 10: {
                mensaje = "" + cargarNumeros(primos) + "\n"
                        + "----------------------------------------------------- \n"
                        + "" + cargarRenglones(primos, renglon2) + "\n"
                        + "" + cargarRenglones(renglon2, renglon3) + "\n"
                        + "" + cargarRenglones(renglon3, renglon4) + "\n"
                        + "" + cargarRenglones(renglon4, renglon5) + "\n"
                        + "" + cargarRenglones(renglon5, renglon6) + "\n"
                        + "" + cargarRenglones(renglon6, renglon7) + "\n"
                        + "" + cargarRenglones(renglon7, renglon8) + "\n"
                        + "" + cargarRenglones(renglon8, renglon9) + "\n"
                        + "" + cargarRenglones(renglon9, renglonFantasma) + "\n";
                break;
            }//fin case 10

        }//fin switch

    }//fin metodo calcGilbreath()

}//fin clase Gilbreath
