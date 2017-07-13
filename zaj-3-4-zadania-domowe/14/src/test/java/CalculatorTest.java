import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addition() throws Exception {
        assertEquals(Calculator.addition(5,7), 12);
        assertEquals(Calculator.addition(33,3), 36);
    }

    @Test
    public void subtraction() throws Exception {
        assertEquals(Calculator.subtraction(10,7), 3);
        assertEquals(Calculator.subtraction(500,100), 400);
    }

}