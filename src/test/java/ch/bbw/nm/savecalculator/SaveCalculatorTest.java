package ch.bbw.nm.savecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTest {

    private SaveCalculator testee;

    @Before
    public void setUP(){
        testee = new SaveCalculator();
    }


    // Addition

    @Test (expected = AssertionError.class)
    public void testsummeMinMaxValue() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.summe(value1, value2) == 0);
    }


    @Test
    public void testsummeZweiPositiveIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }
    @Test
    public void testsummeEinsPositivundEinNegativIsOK() {
        int value1 = 10;
        int value2 = -20;
        assertTrue(testee.summe(value1, value2) == -10);
    }
    @Test
    public void testsummeZweiNegativeIsOk() {
        int value1 = -10;
        int value2 = -20;
        assertTrue(testee.summe(value1, value2) == -30);
    }
    @Test (expected = ArithmeticException.class)
    public void testsummeEineRandzahlIsOK() {
        int value1 = 1;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.summe(value1, value2) != 0);
    }
    @Test (expected = ArithmeticException.class)
    public void testsummeEineMinusRandzahlIsOK() {
        int value1 = -1;
        int value2 = Integer.MIN_VALUE;
        assertTrue(testee.summe(value1, value2) != 0);
    }
    @Test
    public void testsummeNullPlusNegativeZahl() {
        int value1 = 0;
        int value2 = -20;
        assertTrue(testee.summe(value1, value2) == -20);
    }
    @Test
    public void testsummeNullPlusZahl() {
        int value1 = 0;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 20);
    }

    // Subtraktion

    @Test
    public void testsubtraktionZweiPositiveIsOK() {
        int subtrahend1 = 10;
        int subtrahend2 = 20;
        assertTrue(testee.subtraktion(subtrahend1, subtrahend2) == -10);
    }
    @Test
    public void testsubtraktionEinsPositivundEinNegativIsOK() {
        int subtrahend1 = 10;
        int subtrahend2 = -20;
        assertTrue(testee.subtraktion(subtrahend1, subtrahend2) == 30);
    }
    @Test
    public void testsubtraktionZweiNegativeIsOk() {
        int subtrahend1 = -10;
        int subtrahend2 = -20;
        assertTrue(testee.subtraktion(subtrahend1, subtrahend2) == 10);
    }
    @Test (expected = AssertionError.class)
    public void testsubtraktionEineRandzahlIsOK() {
        int subtrahend1 = Integer.MAX_VALUE;
        int subtrahend2 = 1;
        assertFalse(testee.subtraktion(subtrahend1, subtrahend2) != 0);
    }
    @Test (expected = ArithmeticException.class)
    public void testsubtraktionEineMinusRandzahlIsOK() {
        int subtrahend1 = 1;
        int subtrahend2 = Integer.MIN_VALUE;
        assertTrue(testee.subtraktion(subtrahend1, subtrahend2) != 10);
    }
    @Test
    public void testsubtraktionNullundZahl() {
        int subtrahend1 = 0;
        int subtrahend2 = 20;
        assertTrue(testee.subtraktion(subtrahend1, subtrahend2) == -20);
    }
    @Test
    public void testsubtraktionNullundNegativeZahl() {
        int subtrahend1 = 0;
        int subtrahend2 = -20;
        assertTrue(testee.subtraktion(subtrahend1, subtrahend2) == 20);
    }
    @Test (expected = ArithmeticException.class)
    public void testsubtraktionMinMaxValue() {
        int subtrahend1 = Integer.MIN_VALUE;
        int subtrahend2 = Integer.MAX_VALUE;
        assertTrue(testee.subtraktion(subtrahend1, subtrahend2) != 0);
    }

    // division

    @Test (expected = AssertionError.class)
    public void testdivisionMinMaxValue() {
        int subtrahend1 = Integer.MIN_VALUE;
        int subtrahend2 = Integer.MAX_VALUE;
        assertFalse(testee.division(subtrahend1, subtrahend2) != 0);
    }

    @Test
    public void testdivisionZweiPositiveIsOk() {
        int dividend1 = 10;
        int dividend2 = 2;
        assertTrue(testee.division(dividend1, dividend2) == 5);
    }

    @Test
    public void testdivisionEinsPositivundEinNegativIsOK() {
        int dividend1 = 10;
        int dividend2 = -2;
        assertTrue(testee.division(dividend1, dividend2) == -5);
    }
    @Test
    public void testdivisionZweiNegativeIsOk() {
        int dividend1 = -10;
        int dividend2 = -2;
        assertTrue(testee.division(dividend1, dividend2) == 5);
    }
    @Test (expected = AssertionError.class)
    public void testdivisionEineRandzahlIsOK() {
        int dividend1 = 10;
        int dividend2 = Integer.MAX_VALUE;
        assertFalse(testee.division(dividend1, dividend2) == 0);
    }
    @Test (expected = AssertionError.class)
    public void testdivisionEineMinusRandzahlIsOK() {
        int dividend1 = 10;
        int dividend2 = Integer.MIN_VALUE;
        assertFalse(testee.division(dividend1, dividend2) == 0);
    }
    @Test (expected = ArithmeticException.class)
    public void testdivisionNullundNegativeZahl() {
        int dividend1 = 0;
        int dividend2 = 2;
        assertFalse(testee.division(dividend1, dividend2) == 0);
    }
    @Test (expected = ArithmeticException.class)
    public void testdivisionNullPlusZahl() {
        int dividend1 = 0;
        int dividend2 = +2;
        assertFalse(testee.division(dividend1, dividend2) == 0);
    }











}