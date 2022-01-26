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

}