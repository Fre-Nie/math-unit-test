import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestSubtract {
    private BasicMath mathTest;

    @Before
    public void setUp() throws Exception {
        mathTest = new BasicMath();
    }

    @Test
    public void simpleSubtract() {
        int a = 4;
        int b = 2;
        int result = mathTest.subtract(a, b);
        assertTrue(result == 2);
    }

    @Test
    public void subtractNegativeNumbers(){
        int a = -4;
        int b = -2;
        int result = mathTest.subtract(a, b);
        assertTrue(result == -2);
    }
}