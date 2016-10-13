package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void emptyString()
    {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void oneNumber()
    {
        assertEquals(3, Calculator.add("3"));
    }

    @Test
    public void twoNumbers()
    {
        assertEquals(3, Calculator.add("1,2"));
    }

    @Test
    public void threeNumbers()
    {
        assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void fiveNumbers()
    {
        assertEquals(15, Calculator.add("1,2,3,4,5"));
    }

    @Test
    public void stringWithNewLine()
    {
        assertEquals(3, Calculator.add("1\n2"));
    }

    @Test
    public void stringWithCommasAndNewLine()
    {
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void stringWithNegativeNumber()
    {
        assertEquals("Negatives not allowed: -1", Calculator.add("-1,2"));
    }
}