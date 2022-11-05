import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivide {

    @Test
    public void test(){
        JunitTesting test = new JunitTesting();
        double output = test.divide(10, 2);
        assertEquals(5, output, 0.0f);
    }
    @Test
    public void test2(){
        JunitTesting test2 = new JunitTesting();
        double output = test2.divide(10, 2);
        assertEquals(-5, output, 0.0f);
    }
    
}
