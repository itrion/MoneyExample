package moneyExample;

import static org.junit.Assert.*;
import org.junit.Test;
import org.specbyexample.moneyexample.Dollar;
import org.specbyexample.moneyexample.Franc;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(3).equals(new Franc(5)));
        assertFalse(new Dollar(5).equals(new Franc(5)));
    }
}
