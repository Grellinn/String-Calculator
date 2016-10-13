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
}