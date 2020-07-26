
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModeloTest {
    
    static  Modelo instance ;
    
    public ModeloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Modelo();
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
    public void testMostrarResulUno() {
        System.out.println("mostrarResul");
        instance.setImc(18.49);
        String expResult = "Usted tiene insuficiencia ponderal";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testMostrarResulDos() {
        System.out.println("mostrarResul");
        instance.setImc(18.5);
        String expResult = "Usted esta en forma saludable";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
    @Test
     public void testMostrarResulTres() {
        System.out.println("mostrarResul");
        instance.setImc(24.98);
        String expResult = "Usted esta en forma saludable";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
     @Test
     public void testMostrarResulCuatro() {
        System.out.println("mostrarResul");
        instance.setImc(25);
        String expResult = "Usted esta en sobrepeso";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
      @Test
      public void testMostrarResulCinco() {
        System.out.println("mostrarResul");
        instance.setImc(29.98);
        String expResult = "Usted esta en sobrepeso";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
      @Test
       public void testMostrarResulSeis() {
        System.out.println("mostrarResul");
        instance.setImc(30);
        String expResult = "Usted esta en obesidad 1";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
       @Test
        public void testMostrarResulSiete() {
        System.out.println("mostrarResul");
        instance.setImc(34.98);
        String expResult = "Usted esta en obesidad 1";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
        @Test
         public void testMostrarResulOcho() {
        System.out.println("mostrarResul");
        instance.setImc(35);
        String expResult = "Usted esta en obesidad 2";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
         @Test
          public void testMostrarResulNueve() {
        System.out.println("mostrarResul");
        instance.setImc(39.98);
        String expResult = "Usted esta en obesidad 2";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
         @Test 
         public void testMostrarResulDiez() {
        System.out.println("mostrarResul");
        instance.setImc(40);
        String expResult = "Usted esta en obesidad 3";
        String result = instance.mostrarResul();
        assertEquals(expResult, result);

    }
        
    
}
