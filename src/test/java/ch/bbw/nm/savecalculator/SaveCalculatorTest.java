package ch.bbw.nm.savecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTest {

    @Test
    public void testsummeZweiPositiveIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }
    @Test
    public void testsummeEinsPositivundEinNegativIsOK() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = -20;
        assertTrue(testee.summe(value1, value2) == -10);
    }
    @Test
    public void testsummeZweiNegativeIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -10;
        int value2 = -20;
        assertTrue(testee.summe(value1, value2) == -30);
    }

}