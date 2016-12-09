import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rico on 2016/12/9.
 */
public class CalculatorTest {

    Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() throws Exception {
        assertEquals(calculator.add(1, 3), 4);
    }


    @Test
    public void addFail() throws Exception {
        assertEquals(calculator.add(1, 3), 5);
    }
}