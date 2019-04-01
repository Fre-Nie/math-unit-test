import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestMultiply {
    private BasicMath mathTest;

    @Before
    public void setUp() throws Exception {
        mathTest = new BasicMath();
    }

    @Test
    public void simpleMultiply() {
        int a = 4;
        int b = 2;
        int result = mathTest.multiply(a, b);
        assertTrue(result == 8);
    }

    @Test
    public void multiplyNegativeNumbers(){
        int a = -4;
        int b = -2;
        int result = mathTest.multiply(a, b);
        assertTrue(result == 8);
    }
}