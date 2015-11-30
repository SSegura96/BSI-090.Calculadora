package Tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import AreasPlanas.*;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio Segura Vidal
 */
public class TestAreas {
    
    public TestAreas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void TestCirculo()
    {
        double valorEsperado = 0;
        double valorDado = 0;
        
        ACirculo acirculo = new ACirculo();
        acirculo.setRadio(6);
        valorEsperado = 113.10;
        valorDado = acirculo.calcArea();
        assertTrue(valorDado == valorEsperado);
    }
    
    @Test
    public void TestTriangulo()
    {
        
    }
    
    @Test
    public void TestCuadrado()
    {
        double valorEsperado = 0;
        double valorDado = 0;
        
        ACuadrado acuadrado = new ACuadrado();
        acuadrado.setValorLado(12);
        valorEsperado = 144.00;
        valorDado = acuadrado.calcArea();
        assertTrue(valorDado == valorEsperado);
    }
    
    @Test
    public void TestRectangulo()
    {
        double valorEsperado = 0;
        double valorDado = 0;
        
        ARectangulo arectangulo = new ARectangulo();
        arectangulo.setBase(12);
        arectangulo.setAltura(19);
        valorEsperado = 228.00;
        valorDado = arectangulo.calcArea();
        assertTrue(valorDado == valorEsperado);
    }
    
    @Test
    public void TestRombo()
    {
        double valorEsperado = 0;
        double valorDado = 0;
        
        ARombo arombo = new ARombo();
        arombo.setDiagMayor(24);
        arombo.setDiagMenor(62);
        valorEsperado = 744;
        valorDado = arombo.calcArea();
        assertTrue(valorDado == valorEsperado);
    }
    
    @Test
    public void TestRomboide()
    {
        double valorEsperado = 0;
        double valorDado = 0;
        
        ARomboide aromboide = new ARomboide();
        aromboide.setBase(9);
        aromboide.setAltura(14);
        valorEsperado = 126.00;
        valorDado = aromboide.calcArea();
        assertTrue(valorDado == valorEsperado);
    }
    
    @Test
    public void TestTrapecio()
    {
        double valorEsperado = 0;
        double valorDado = 0;
        
        ATrapecio atrapecio = new ATrapecio();
        atrapecio.setBaseMayor(10);
        atrapecio.setBaseMenor(14);
        atrapecio.setAltura(5);
        valorEsperado = 60.00;
        valorDado = atrapecio.calcArea();
        assertTrue(valorDado == valorEsperado);
    }
    
    @Test
    public void TestPoligonoRegular()
    {
        double valorEsperado = 0;
        double valorDado = 0;
        
        APoligonoRegular apoligonoRegular = new APoligonoRegular();
        apoligonoRegular.setMedidaLado(6);
        apoligonoRegular.setNumeroLados(5);
        valorEsperado = 60.00;
        valorDado = apoligonoRegular.calcArea();
        assertTrue(valorDado == valorEsperado);
    }
    
    
}
