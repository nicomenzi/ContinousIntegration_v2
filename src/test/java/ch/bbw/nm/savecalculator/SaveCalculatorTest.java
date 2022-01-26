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
    public void testsummeEineminusRandzahlIsOK() {
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






}