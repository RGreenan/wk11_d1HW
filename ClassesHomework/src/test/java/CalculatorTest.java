import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(25, 5);
    }

    @Test
    public void canAdd(){
        assertEquals(30, calculator.willAdd());
    }

    @Test
    public void canSubtract(){
        assertEquals(20, calculator.willSubtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(125, calculator.willMultiply());
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.willDivide());
    }
}
