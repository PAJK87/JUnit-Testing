import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquare {
   @Test
   public void test(){
        JunitTesting test = new JunitTesting();
        int output = test.square(5);
        assertEquals(25, output);
   }


}

