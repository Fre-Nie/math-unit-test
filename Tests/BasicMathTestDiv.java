import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestDiv {

    private BasicMath mathTest;

    @Before
    public void setUp() throws Exception {
        mathTest = new BasicMath();
    }


    @Test
    public void simpleDivTest() {
        int a = 4;
        int b = 2;
        int result = mathTest.div(a, b);
        assertTrue(result == 2);
    }

    @Test
    public void DivNegativtNumbers(){
        int a = -4;
        int b = -2;
        int result = mathTest.div(a, b);
        assertTrue(result == 2);
        System.out.println(result);
    }

    @Test
    public void DivByZero(){
        int a = 4;
        int b = 0;
        int result = mathTest.div(a ,b);
        assertTrue(result == 0);
    }
}