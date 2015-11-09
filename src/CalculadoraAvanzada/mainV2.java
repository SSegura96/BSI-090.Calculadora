/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraAvanzada;

import javax.swing.DefaultComboBoxModel;
import AreasPlanas.*;
import PerimetrosPlanos.*;
import Estadistica.JFSumatoria;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Javier Fernandez & Sergio Segura
 */
public class mainV2 extends javax.swing.JFrame 
{

    /**
     * Creates new form mainV2
     */
    public mainV2() 
    {
        initComponents();
        inicializarComboBox();
        setLocationRelativeTo(null);
        inicializarHoraFecha();
    }

    String[] menuPrincipal = {"Áreas de figuras planas(2D).",
        "Perímetros de figuras planas (2D).", "Estadística.",
        "Probabilidades y combinaciones.", "Superficies.", "Volúmenes.",
        "Vectores.", "Matrices.", "Conjeturas."};
    String[] areasPlanas = {"Circulo.", "Triangulo.",
        "Cuadrado.", "Rectángulo.", "Rombo.", "Trapecio.", "Romboide.",
        "Polígono Regular"};
    String[] perimetrosPlanos = {"Circulo.", "Triangulo.",
        "Cuadrado.", "Rectángulo.", "Rombo.", "Trapecio.", "Romboide.",
        "Polígono Regular"};
    String[] estadistica = {"Sumatoria", "Moda", "Promedio", "Mediana", "Varianza",
        "Desviación Estandar"};
    String[] probabilidad = {"Factorial.", "Permutación.",
        "Combinatoria.", "Probabilidad Simple."};
    String[] superficies = {"Esfera.", "Cilindro.",
        "Cono.", "Hexaedro Regular.", "Prisma.", "Paralelipipedo.",
        "Piramide Regular."};
    String[] volumenes = {"Esfera.", "Cilindro.",
        "Cono.", "Hexaedro Regular.", "Prisma.", "Paralelipipedo.",
        "Piramide Regular."};
    String[] vectores = {"Escalar.", "Suma.",
        "Producto."};
    String[] matrices = {"Escalar.", "Suma.",
        "Producto."};

    public void inicializarComboBox() 
    {
        jCOperaciones.setModel(new DefaultComboBoxModel(menuPrincipal));
        jCSubmenu.setModel(new DefaultComboBoxModel(areasPlanas));
    }

    public void llenarComboSubmenu() 
    {
        int indiceOp = jCOperaciones.getSelectedIndex();

        switch (indiceOp) 
        {
            case 0:
                jCSubmenu.setModel(new DefaultComboBoxModel(areasPlanas));
                break;

            case 1:
                jCSubmenu.setModel(new DefaultComboBoxModel(perimetrosPlanos));
                break;

            case 2:
                jCSubmenu.setModel(new DefaultComboBoxModel(estadistica));
                break;

            case 3:
                jCSubmenu.setModel(new DefaultComboBoxModel(probabilidad));
                break;

            case 4:
                jCSubmenu.setModel(new DefaultComboBoxModel(superficies));
                break;

            case 5:
                jCSubmenu.setModel(new DefaultComboBoxModel(volumenes));
                break;

            case 6:
                jCSubmenu.setModel(new DefaultComboBoxModel(vectores));
                break;

            case 7:
                jCSubmenu.setModel(new DefaultComboBoxModel(matrices));
                break;
        }
    }

    public void inicializarHoraFecha ()
    {   
        Date date = new Date();
        
        DateFormat hora = new SimpleDateFormat("hh:mm");
        
        DateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
        
        jLHora.setText(hora.format(date));
        jLFecha.setText(fecha.format(date));
    }
    
    public void seleccionarElemento() 
    {
        int indiceOp = jCOperaciones.getSelectedIndex();
        int indiceSub = jCSubmenu.getSelectedIndex();

        switch (indiceOp) {
            //Áreas de figuras planas(2D)
            case 0:

                switch (indiceSub) {
                    //Circulo
                    case 0:
                        ACirculo aCir = new ACirculo();
                        aCir.mostrarImagen("Circulo");
                        aCir.pedirDatos();
                        aCir.calcArea();
                        aCir.resultado();
                    break;

                    //Triangulo
                    case 1:
                        ATriangulo aTri = new ATriangulo();
                        aTri.mostrarImagen("Triangulo");
                        aTri.pedirDatos();
                        aTri.calcArea();
                        aTri.resultado();
                    break;

                    //Cuadrado
                    case 2:
                        ACuadrado aCua = new ACuadrado();
                        aCua.mostrarImagen("Cuadrado");
                        aCua.pedirDatos();
                        aCua.calcArea();
                        aCua.resultado();
                    break;

                    //Rectangulo
                    case 3:
                        ARectangulo aRec = new ARectangulo();
                        aRec.mostrarImagen("Rectangulo");
                        aRec.pedirDatos();
                        aRec.calcArea();
                        aRec.resultado();
                    break;

                    //Rombo
                    case 4:
                        ARombo aRob = new ARombo();
                        aRob.mostrarImagen("Rombo");
                        aRob.pedirDatos();
                        aRob.calcArea();
                        aRob.resultado();
                    break;

                    //Trapecio
                    case 5:
                        ATrapecio trap = new ATrapecio();
                        trap.mostrarImagen("Trapecio");
                        trap.pedirDatos();
                        trap.calcArea();
                        trap.resultado();
                    break;

                    //Romboide
                    case 6:
                        ARomboide romb = new ARomboide();
                        romb.mostrarImagen("Romboide");
                        romb.pedirDatos();
                        romb.calcArea();
                        romb.resultado();
                    break;

                    //Poigonos Regulares
                    case 7:
                        APoligonoRegular pr = new APoligonoRegular();
                        pr.mostrarImagen("PoligonoRegular");
                        pr.pedirDatos();
                        pr.calcArea();
                        pr.resultado();
                    break;
                }

                break;

            //Perímetros de figuras planas (2D)
            case 1:
                switch (indiceSub) 
                {
                    //Circulo
                    case 0:
                        PCirculo pCir = new PCirculo();
                        pCir.pedirDatos();
                        pCir.calcPerimetro();
                        pCir.resulatado();
                    break;
                    
                    //Triangulo
                    case 1:
                        
                    break;
                        
                    //Cuadrado    
                    case 2:
                        PCuadrado pCua = new PCuadrado();
                        pCua.pedirDatos();
                        pCua.calcPerimetro();
                        pCua.resulatado();
                    break;
                    
                    //Rectangulo    
                    case 3:
                        PRomboide pRec = new PRomboide();
                        pRec.pedirDatos();
                        pRec.calcPerimetro();
                        pRec.resulatado();
                    break;
                    
                    //Rombo    
                    case 4:
                        PRombo pRom = new PRombo();
                        pRom.pedirDatos();
                        pRom.calcPerimetro();
                        pRom.resulatado();
                    break;
                        
                    //Trapecio    
                    case 5:
                        
                    break;
                    
                    //Romboide    
                    case 6:
                        PRomboide pRim = new PRomboide();
                        pRim.pedirDatos();
                        pRim.calcPerimetro();
                        pRim.resulatado();
                    break;
                        
                    //Poligono Regular    
                    case 7:
                        PPoligonoRegular pp = new PPoligonoRegular();
                        pp.pedirDatos();
                        pp.calcPerimetro();
                        pp.resulatado();
                    break;
                }
            break;

            //Estadistica
            case 2:
                switch (indiceSub)
                {
                    case 0:
                        JFSumatoria jfSumatoria = new JFSumatoria();
                        jfSumatoria.setVisible(true);
                        this.setVisible(false);
                    break;
                }
            break;

            case 3:

            break;

            case 4:

            break;

            case 5:

            break;

            case 6:

            break;

            case 7:

            break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLHora = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jCOperaciones = new javax.swing.JComboBox();
        jCSubmenu = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHora.setText("Hora");

        jLFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFecha.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione la opereracion a realizar ");

        jCOperaciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCOperaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCOperacionesFocusLost(evt);
            }
        });
        jCOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCOperacionesActionPerformed(evt);
            }
        });

        jCSubmenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCSubmenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCSubmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCSubmenuMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione un submenu");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Menu Principal");

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("¡Ir!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCSubmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jCOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jCSubmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCSubmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCSubmenuMouseClicked

    }//GEN-LAST:event_jCSubmenuMouseClicked

    private void jCOperacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCOperacionesFocusLost

    }//GEN-LAST:event_jCOperacionesFocusLost

    private void jCOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCOperacionesActionPerformed
        llenarComboSubmenu();
    }//GEN-LAST:event_jCOperacionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        seleccionarElemento();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new mainV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCOperaciones;
    private javax.swing.JComboBox jCSubmenu;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}