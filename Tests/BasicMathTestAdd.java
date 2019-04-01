import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTestAdd {

    private BasicMath mathTest;

    @Before
    public void setUp() throws Exception {
        mathTest = new BasicMath();
    }

    @Test
    public void simpleAddTest() {
        int a = 4;
        int b = 2;
        int result = mathTest.add(a, b);
        assertTrue(result == 6);
    }

    @Test
    public void addNegativeNumbers(){
        int a = -4;
        int b = -2;
        int result = mathTest.add(a, b);
        assertTrue(result == -6);
    }

    @Test
    public void addDecimalNumbers(){
        double a = 0.4;
        double b = 0.3;
        double result = 0;
        result = mathTest.add((int) a, (int) b);
        assertTrue(result == 0.7);
        //Does not work because the mathTest.add method is of the type integer, program can't handle decimal numbers
    }

    @Test
    public void FibonacciTest(){
        int a = 5;
        int result = mathTest.fibonacci(a);
        System.out.println(result);
        assertTrue(result == 5);
    }


}