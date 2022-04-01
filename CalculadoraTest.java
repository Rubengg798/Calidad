
package Calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double number1 = 1.0;
        double number2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.0;
        double result = instance.suma(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double number1 = 3.0;
        double number2 = 1.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.resta(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double number1 = 2.0;
        double number2 = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 6.0;
        double result = instance.multiplicacion(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double number1 = 4.0;
        double number2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.division(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of raizCuadrada1 method, of class Calculadora.
     */
    @Test
    public void testRaizCuadrada1() {
        System.out.println("raizCuadrada1");
        double number1 = 4.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.raizCuadrada1(number1);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of raizCuadrada2 method, of class Calculadora.
     */
    @Test
    public void testRaizCuadrada2() {
        System.out.println("raizCuadrada2");
        double number2 = 25.0;
        Calculadora instance = new Calculadora();
        double expResult = 5.0;
        double result = instance.raizCuadrada2(number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Logaritmo1 method, of class Calculadora.
     */
    @Test
    public void testLogaritmo1() {
        System.out.println("Logaritmo1");
        double number1 = 10.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.302585092994046;
        double result = instance.Logaritmo1(number1);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Logaritmo2 method, of class Calculadora.
     */
    @Test
    public void testLogaritmo2() {
        System.out.println("Logaritmo2");
        double number2 = 1.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.Logaritmo2(number2);
        assertEquals(expResult, result, 0.0);
    }
    
}
