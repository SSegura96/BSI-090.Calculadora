package Estadistica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez Alvarado & Sergio Segura Vidal
 */

public class Mediana extends abEstadistica
{
    private double [] vectorValoresMediana;
    private int tamanno;
    private double mediana;
    private double mediana2;
    private String mensaje;
    
    public Mediana() 
    {
        vectorValoresMediana = new double[0];
        tamanno = 0;
        mediana = 0.0;
        mediana2 = 0.0;
        mensaje = "";
    }//fin constructor

    public double[] getVectorValoresMediana() {
        return vectorValoresMediana;
    }

    public void setVectorValoresMediana(double[] vectorValoresMediana) {
        this.vectorValoresMediana = vectorValoresMediana;
    }

    public int getTamanno() {
        return tamanno;
    }

    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    public double getMediana2() {
        return mediana2;
    }

    public void setMediana2(double mediana2) {
        this.mediana2 = mediana2;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public void mostrarImagen() {
        JOptionPane.showMessageDialog(null, "", "Mediana",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/imgs/Mediana.png"));
    }//fin metodo mostrarImagen
    
    public void llenarVector() 
    {
        for (int i = 0; i < vectorValoresMediana.length; i++) 
        {
            vectorValoresMediana[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dato #" + i + " :"));
        }//fin primer for
        
    }//fin metodo llenarVector()
    
    public void pedirDatos()
    {
        tamanno = fallo.intValidarExcepciones("Digite la cantidad de numeros que va a ingresar:");
        vectorValoresMediana = new double[tamanno];
        
        llenarVector();
        ordenarNumeros(vectorValoresMediana);
    }//fin metodo pedirDatos()
    
    public boolean esPar(int numero)
    {
        if (numero % 2 == 0)
        {
            return true;
        }//fin if
        else
        {
            return false;
        }//fin else
    }//fin metodo esPar(int numero)
    
    public void resultado() {
        JOptionPane.showMessageDialog(null, mensaje);
    }//fin metodo resultado()
    
    public String ordenarNumeros(double[] vector1)
    {
        String dato = "";
        for (int i = 0; i < tamanno-1; i++) 
        {
            int min = i;
            for (int j = i+1; j < tamanno; j++) 
            {
                if(vector1[j] < vector1[min])
                {
                    min = j;
                }//fin if
            }//fin segundo for
            
            if(i != min)
            {
                double aux = vector1[i];
                vector1[i] = vector1[min];
                vector1[min] = aux;
            }//fin if
            
        }//fin primer for
        
        for (int k = 0; k < tamanno; k++) 
        {
            dato += ""+vector1[k]+", ";
        }//fin tercer for
        
        return dato;
    }//fin metodo ordenarNumeros()
    
    public void calcMediana()
    {
        if(esPar(tamanno))
        {
            
            int indice = (vectorValoresMediana.length-1)/2;
            
            for (int i = 0; i < vectorValoresMediana.length; i++) 
            {
                if (i == indice)
                {
                    mediana = vectorValoresMediana[i];
                    mediana2 = vectorValoresMediana[i+1];
                    i = vectorValoresMediana.length +1;
                    
                }//fin if
            }//fin primer for
            mediana2 = (mediana + mediana2)/2;
            
            mensaje = "La serie de numeros es par. \n"
                    + "{"+ordenarNumeros(vectorValoresMediana)+"}\n"
                    + "Mediana: "+mediana2;
        }//fin if
        else
        {
            int indice = (vectorValoresMediana.length-1)/2;
            
            for (int i = 0; i < vectorValoresMediana.length; i++) 
            {
                if (i == indice)
                {
                    mediana = vectorValoresMediana[i];
                    i = vectorValoresMediana.length;
                }//fin if
                
            }//fin primer for
            mensaje = "La serie de numeros es impar. \n"
                    + "{"+ordenarNumeros(vectorValoresMediana)+"} \n"
                    + "Mediana: "+mediana;
        }//fin else
        
    }//fin metodo calcMediana()
    
}//fin clase Mediana