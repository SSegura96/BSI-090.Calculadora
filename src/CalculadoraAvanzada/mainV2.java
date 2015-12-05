package CalculadoraAvanzada;

import javax.swing.DefaultComboBoxModel;
import AreasPlanas.*;
import PerimetrosPlanos.*;
import Estadistica.*;
import ArreglosUnidimensionales.*;
import Matrices.*;
import Conjeturas.*;
import Volumenes.*;
import ProbabilidadYCombinaciones.*;
import Superficies.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Javier Fernandez & Sergio Segura
 */
public class mainV2 extends javax.swing.JFrame {

    /**
     * Creates new form mainV2
     */
    public void mostrarImagen(String nombre) {
        JOptionPane.showMessageDialog(null, null, nombre,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon("src/imgs/" + nombre + ".png"));
    }

    public mainV2() {
        initComponents();
        inicializarComboBox();
        setLocationRelativeTo(null);
        inicializarHoraFecha();
    }

    String[] menuPrincipal = {"Áreas de figuras planas(2D).",
        "Perímetros de figuras planas (2D).", "Estadística.",
        "Probabilidades y combinaciones.", "Superficies.", "Volúmenes.",
        "Vectores.", "Matrices.", "Conjeturas."};
    String[] areasPlanas = {"Circulo.", "Triangulo Equilatero.",
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
        "Producto"};
    String[] conjeturas = {"Ulmann.", "Gillbreath."};

    private void inicializarComboBox() {
        jCOperaciones.setModel(new DefaultComboBoxModel<>(menuPrincipal));
        jCSubmenu.setModel(new DefaultComboBoxModel<>(areasPlanas));
    }

    public void llenarComboSubmenu() {
        int indiceOp = jCOperaciones.getSelectedIndex();

        switch (indiceOp) {
            case 0:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(areasPlanas));
                break;

            case 1:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(perimetrosPlanos));
                break;

            case 2:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(estadistica));
                break;

            case 3:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(probabilidad));
                break;

            case 4:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(superficies));
                break;

            case 5:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(volumenes));
                break;

            case 6:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(vectores));
                break;

            case 7:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(matrices));
                break;

            case 8:
                jCSubmenu.setModel(new DefaultComboBoxModel<>(conjeturas));
                break;
        }
    }

    private void inicializarHoraFecha() {
        Date date = new Date();

        DateFormat hora = new SimpleDateFormat("hh:mm");

        DateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");

        jLHora.setText(hora.format(date));
        jLFecha.setText(fecha.format(date));
    }

    public void seleccionarElemento() {
        int indiceOp = jCOperaciones.getSelectedIndex();
        int indiceSub = jCSubmenu.getSelectedIndex();

        switch (indiceOp) {
            //Áreas de figuras planas(2D)
            case 0:

                switch (indiceSub) {
                    //Circulo
                    case 0:
                        ACirculo aCirculo = new ACirculo();
                        try {
                            aCirculo.mostrarImagen();
                            aCirculo.pedirDatos();
                            aCirculo.calcArea();
                            aCirculo.mostarDatos();
                        }//fin try
                        catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Triangulo
                    case 1:
                        ATriangulo aTriangulo = new ATriangulo();
                        try {
                            aTriangulo.mostrarImagen();
                            aTriangulo.pedirDatos();
                            aTriangulo.calcArea();
                            aTriangulo.mostarDatos();
                        }//fin try
                        catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Cuadrado
                    case 2:
                        ACuadrado aCuadrado = new ACuadrado();
                        try {
                            aCuadrado.mostrarImagen();
                            aCuadrado.pedirDatos();
                            aCuadrado.calcArea();
                            aCuadrado.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Rectangulo
                    case 3:
                        ARectangulo aRectangulo = new ARectangulo();
                        try {
                            aRectangulo.mostrarImagen();
                            aRectangulo.pedirDatos();
                            aRectangulo.calcArea();
                            aRectangulo.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Rombo
                    case 4:
                        try {
                            ARombo aRombo = new ARombo();
                            aRombo.mostrarImagen();
                            aRombo.pedirDatos();
                            aRombo.calcArea();
                            aRombo.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Trapecio
                    case 5:
                        ATrapecio aTrapecio = new ATrapecio();
                        try {
                            aTrapecio.mostrarImagen();
                            aTrapecio.pedirDatos();
                            aTrapecio.calcArea();
                            aTrapecio.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Romboide
                    case 6:
                        ARomboide aRomboide = new ARomboide();
                        try {
                            aRomboide.mostrarImagen();
                            aRomboide.pedirDatos();
                            aRomboide.calcArea();
                            aRomboide.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Poigonos Regulares
                    case 7:
                        APoligonoRegular aPoligonoRegular = new APoligonoRegular();
                        try {
                            aPoligonoRegular.mostrarImagen();
                            aPoligonoRegular.pedirDatos();
                            aPoligonoRegular.calcArea();
                            aPoligonoRegular.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;
                }//fin switch de AreasPlanas
                break;

            //Perímetros de figuras planas (2D)
            case 1:

                switch (indiceSub) {
                    //Circulo
                    case 0:
                        PCirculo pCirculo = new PCirculo();
                        try {
                            pCirculo.mostrarImagen();
                            pCirculo.pedirDatos();
                            pCirculo.calcPerimetro();
                            pCirculo.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Triangulo
                    case 1:
                        PTriangulo pTriangulo = new PTriangulo();
                        try {
                            pTriangulo.mostrarImagen();
                            pTriangulo.pedirDatos();
                            pTriangulo.calcPerimetro();
                            pTriangulo.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Cuadrado    
                    case 2:
                        PCuadrado pCuadrado = new PCuadrado();
                        try {
                            pCuadrado.mostrarImagen();
                            pCuadrado.pedirDatos();
                            pCuadrado.calcPerimetro();
                            pCuadrado.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Rectangulo    
                    case 3:
                        PRectangulo pRectangulo = new PRectangulo();
                        try {
                            pRectangulo.mostrarImagen();
                            pRectangulo.pedirDatos();
                            pRectangulo.calcPerimetro();
                            pRectangulo.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Rombo    
                    case 4:
                        PRombo pRombo = new PRombo();
                        try {
                            pRombo.mostrarImagen();
                            pRombo.pedirDatos();
                            pRombo.calcPerimetro();
                            pRombo.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Trapecio    
                    case 5:
                        PTrapecio pTrapecio = new PTrapecio();
                        try {
                            pTrapecio.mostrarImagen();
                            pTrapecio.pedirDatos();
                            pTrapecio.calcPerimetro();
                            pTrapecio.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Romboide    
                    case 6:
                        PRomboide pRomboide = new PRomboide();
                        try {
                            pRomboide.mostrarImagen();
                            pRomboide.pedirDatos();
                            pRomboide.calcPerimetro();
                            pRomboide.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Poligono Regular    
                    case 7:
                        PPoligonoRegular pPoligonoRegular = new PPoligonoRegular();
                        try {
                            pPoligonoRegular.mostrarImagen();
                            pPoligonoRegular.pedirDatos();
                            pPoligonoRegular.calcPerimetro();
                            pPoligonoRegular.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;
                }//fin switch Perimetros Planos
                break;

            //Estadistica
            case 2:

                mostrarImagen("estadistica");

                switch (indiceSub) {
                    //Sumatoria
                    case 0:
                        JFSumatoria jfSumatoria = new JFSumatoria();
                        jfSumatoria.setVisible(true);
                        this.setVisible(false);
                        break;

                    //Moda
                    case 1:
                        Moda moda = new Moda();
                        try {
                            moda.mostrarImagen();
                            moda.pedirDatos();
                            moda.calcModa();
                            moda.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //promedio
                    case 2:
                        Promedio prom = new Promedio();
                        try {
                            prom.mostrarImagen();
                            prom.pedirDatos();
                            prom.calcPromedio();
                            prom.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Mediana
                    case 3:
                        Mediana mediana = new Mediana();
                        try {
                            mediana.mostrarImagen();
                            mediana.pedirDatos();
                            mediana.calcMediana();
                            mediana.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //varianza
                    case 4:
                        Varianza var = new Varianza();
                        try {

                            var.calcVarianza();
                            var.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    case 5:
                        DesviacionEstandar des = new DesviacionEstandar();
                        try {
                            des.calcDesviacionEstandar();
                            des.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;
                }//fin switch Estadistica
                break;

            //Probabilidad y Combinaciones    
            case 3:
                switch (indiceSub) {
                    //Factorial
                    case 0:
                        Factorial fac = new Factorial();
                        try {
                            fac.pedirDatos();
                            fac.calcFactorial();
                            fac.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Permutacion
                    case 1:
                        Permutacion permutacion = new Permutacion();
                        try {
                            permutacion.pedirDatos();
                            permutacion.calcPermutacion();
                            permutacion.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Combinatoria
                    case 2:
                        Combinatoria comb = new Combinatoria();
                        try {
                            comb.pedirDatos();
                            comb.calcCombinatoria();
                            comb.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Probabilidad Simple
                    case 3:
                        ProbabilidadSimple probabilidadSimple = new ProbabilidadSimple();
                        try {
                            probabilidadSimple.mostrarImagen();
                            probabilidadSimple.pedirDatos();
                            probabilidadSimple.calcProbabilidadSimple();
                            probabilidadSimple.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;
                }//fin switch Probabilidad Y Combinaciones
                break;

            //Superficies
            case 4:
                switch (indiceSub) {
                    //Esfera
                    case 0:
                        SEsfera sEsfera = new SEsfera();
                        try {
                            sEsfera.mostrarImagen();
                            sEsfera.pedirDatos();
                            sEsfera.calcSuperficie();
                            sEsfera.mostrarResultado();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Cilindro
                    case 1:
                        SCilindro sCilindro = new SCilindro();
                        try {
                            sCilindro.mostrarImagen();
                            sCilindro.pedirDatos();
                            sCilindro.calcSuperficie();
                            sCilindro.mostrarResultado();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Cono
                    case 2:
                        SCono sCono = new SCono();
                        try {
                            sCono.mostrarImagen();
                            sCono.pedirDatos();
                            sCono.calcSuperficie();
                            sCono.mostrarResultado();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Hexaedro Regular
                    case 3:
                        SHexaedroRegular sHexaedroRegular = new SHexaedroRegular();
                        try {
                            sHexaedroRegular.mostrarImagen();
                            sHexaedroRegular.pedirDatos();
                            sHexaedroRegular.calcSuperficie();
                            sHexaedroRegular.mostrarResultado();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Prisma
                    case 4:
                        SPrisma sPrisma = new SPrisma();
                        try {
                            sPrisma.mostrarImagen();
                            sPrisma.pedirDatos();
                            sPrisma.calcSuperficie();
                            sPrisma.mostrarResultado();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Paralelepipedo
                    case 5:
                        SParalelepipedo sParalelepipedo = new SParalelepipedo();
                        try {
                            sParalelepipedo.mostrarImagen();
                            sParalelepipedo.pedirDatos();
                            sParalelepipedo.calcSuperficie();
                            sParalelepipedo.mostrarResultado();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Piramide Regular
                    case 6:
                        SPiramideRegular sPiramideRegular = new SPiramideRegular();
                        try {
                            sPiramideRegular.mostrarImagen();
                            sPiramideRegular.pedirDatos();
                            sPiramideRegular.calcSuperficie();
                            sPiramideRegular.mostrarResultado();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                }//fin swtich Superficies
                break;

            //volumenes
            case 5:
                switch (indiceSub) {
                    //Esfera
                    case 0:
                        VEsfera vEsfera = new VEsfera();
                        try {
                            vEsfera.mostrarImagen();
                            vEsfera.pedirDatos();
                            vEsfera.calcVolumen();
                            vEsfera.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Cono
                    case 1:
                        VCono vcono = new VCono();
                        try {
                            vcono.mostrarImagen();
                            vcono.pedirDatos();
                            vcono.calcVolumen();
                            vcono.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Hexaedro
                    case 2:
                        VHexaedro vhexaedro = new VHexaedro();
                        try {
                            vhexaedro.mostrarImagen();
                            vhexaedro.pedirDatos();
                            vhexaedro.calcVolumen();
                            vhexaedro.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Prisma
                    case 3:
                        VPrisma vprisma = new VPrisma();
                        try {
                            vprisma.mostrarImagen();
                            vprisma.pedirDatos();
                            vprisma.calcVolumen();
                            vprisma.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Paralelepipedo
                    case 4:
                        VParalelepipedo vparalelepipedo = new VParalelepipedo();
                        try {
                            vparalelepipedo.mostrarImagen();
                            vparalelepipedo.pedirDatos();
                            vparalelepipedo.calcVolumen();
                            vparalelepipedo.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Cilindro
                    case 5:
                        VPiramide vpiramide = new VPiramide();
                        try {
                            vpiramide.mostrarImagen();
                            vpiramide.pedirDatos();
                            vpiramide.calcVolumen();
                            vpiramide.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                }
                break;

            //Vectores
            case 6:

                mostrarImagen("vector");

                switch (indiceSub) {
                    //Escalar
                    case 0:
                        EscalarVectorial escalarVectorial = new EscalarVectorial();
                        try {
                            escalarVectorial.mostrarImagen();
                            escalarVectorial.pedirDatos();
                            escalarVectorial.calcProductoV();
                            escalarVectorial.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Suma
                    case 1:
                        SumaVectorial sumaVecotrial = new SumaVectorial();
                        try {
                            sumaVecotrial.mostrarImagen();
                            sumaVecotrial.pedirDatos();
                            sumaVecotrial.calcSumaV();
                            sumaVecotrial.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;

                    //Producto
                    case 2:
                        ProductoVectorial productoVectorial = new ProductoVectorial();
                        try {
                            productoVectorial.mostrarImagen();
                            productoVectorial.pedirDatos();
                            productoVectorial.calcProductoV();
                            productoVectorial.mostrarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;
                }//fin swicth case 6
                break;

            //Matrices
            case 7:
                Matriz mat = new Matriz();
                try {
                    mostrarImagen("matriz");

                    switch (indiceSub) {
                        //escalar
                        case 0:
                            mat.inicializarMatrices(0);
                            mat.pedirDatos(0);
                            mat.productoEscalar();
                            break;

                        //Suma matrices
                        case 1:
                            mat.inicializarMatrices(1);
                            mat.pedirDatos(1);
                            mat.sumarMatrices();
                            break;

                        //Producto Matrices
                        case 2:
                            mat.inicializarMatrices(1);
                            mat.pedirDatos(1);
                            mat.productoMatrices();
                            break;
                    }
                } catch (NullPointerException e) {
                    //Solo controla el error al cerrar la ventana por eso esta vacio
                }//fin primer catch
                break;

            //Conjeturas
            case 8:
                switch (indiceSub) {
                    //Ulmann
                    case 0:
                        Ulmann ulman = new Ulmann();
                        try {
                            ulman.mostrarImagen();
                            ulman.pedirDatos();
                            ulman.calcUlmann();
                            ulman.mostarDatos();
                        } catch (NullPointerException e) {
                            //Solo controla el error al cerrar la ventana por eso esta vacio
                        }//fin primer catch
                        break;
                }//fin switch Conjeturas
                break;
        }//fin switch menu principal
    }//fin metodo seleccionarElemento()

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
                .addContainerGap(134, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
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
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
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
