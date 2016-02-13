import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by kate on 1/12/16.
 */

    public class CalculatorTest {
    public Calculate calculator = new Calculate();

    @Test
    public void testAddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals(4, calculator.add(2, 2));
    }


    @Test
    public void testAddTwoNegativValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals(-4.0, calculator.add(-2, -2));
    }

    @Test
    public void testAddTwoPositiveNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertFalse(5.0 == calculator.add(2, -6));
    }

    @Test
    public void testSquareRoot() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check


        Assert.assertEquals(13.0, calculator.add(36, 49));
    }


    @Test
    public void testRobTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals(0.0, calculator.rob(2, 2));
    }

    @Test
    public void testRobTwoNegativValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals(-3.0, calculator.rob(-6, -3));

    }

    @Test
    public void testMultiplyTwoPositiveValuesl() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check

        Assert.assertEquals(4, calculator.multiply(2, 2));
        assertEquals("2*2 must be 4", 4, calc.multiply(2, 2));
    }

    @Test
    public void testMultiplyTwoValuesl() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check

        Assert.assertEquals(25, calculator.multiply(5, 5));

    }

    @Test
    public void testDivTwoValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals(6.0, calculator.div(36, 6.0));
    }


    @Test
    public void testDivTwoPositiveValues() {
        // Method to check
        Assert.assertEquals("36/6.0 must be 6.0", 6.0, calculator.div(36, 6.0));
        Assert.assertEquals(5.0, calculator.div(25, 5.0));
        // Method to check
        // assertEquals("36 / 6 must be 6", 6, calculator.div(36, 6));
    }


    @Test
    public void testPercentTwoValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals("6.0 percent 7.0 must be 0.42", 0.42, calculator.percent(7.0, 6.0));
    }
    @Test
    public void testPercentValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        Assert.assertEquals(5.0, calculator.percent(10.0, 50.0));
    }
        @Before
        public void consolePrintbefore () {
            System.out.println("Tests started!!! ");

        }


        @After
        public void consolePrintAfter () {
            System.out.println("Tests finished!!! ");
        }
    }
