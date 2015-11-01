package CalculadoraAvanzada;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernandez & Sergio Segura
 */
public class TestMain 
{
    public static void main(String[] args) 
    {
        boolean salir = false;
        while (!salir) 
        {
            int indice = 0;
            
            Object[] botonesMenuCalcu = {"Áreas de figuras planas(2D).",
                "Perímetros de figuras planas (2D).", "Estadística.",
                "Probabilidades y combinaciones.", "Superficies.", "Volúmenes.",
                "Vectores y Matrices.", "Conjeturas."};

            String elemento = JOptionPane.showInputDialog(null,
                    "Digite el codigo de la opcion desesada: \n", "Calculadora Avanzada",
                    JOptionPane.PLAIN_MESSAGE, null, botonesMenuCalcu,
                    botonesMenuCalcu[0]).toString();
            
            for (int i = 0; i < botonesMenuCalcu.length; i++) 
            {       
                if (botonesMenuCalcu[i] == elemento)
                {
                    indice = i;
                    i=botonesMenuCalcu.length;
                }
            }    
            
            System.out.println(indice);

            /*
             if (menuCalcu > 0 && menuCalcu <= 8)
             {
             switch (menuCalcu) 
             {
             case 1:
             String[] bot = {"1)caca","2)diarrea","putrefaccion","cerote"};
             JOptionPane.showInputDialog(null, "j", null, JOptionPane.INFORMATION_MESSAGE, null, bot, bot[0]);
             {
             short menuFigPlanas = Short.parseShort(JOptionPane.showInputDialog(null, 
             "Digite el codigo de la figura deseada:\n"
             + "\n 1) Circulo. \n 2) Triangulo."
             + "\n 3) Cuadrado \n 4) Rectángulo"
             + "\n 5) Rombo. \n 6)Trapecio. \n 7)Romboide."
             + "\n 8) Polígono Regular", "Figuras Planas(2D)", 
             JOptionPane.PLAIN_MESSAGE));
             }//fin case 1
                    
             }//fin switch menuCalcu
             }//fin primer if
             else
             JOptionPane.showMessageDialog(null, "Debe digitar numeros entre 1 y 8.", 
             "Aviso", JOptionPane.WARNING_MESSAGE);
             }//fin while
        
             System.exit(0);
            
             */
        }
    }//fin main
}//fin class TestMain
