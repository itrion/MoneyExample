package moneyExample;

import org.junit.Test;

public class MultipiclationTest {
    
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
       
}
