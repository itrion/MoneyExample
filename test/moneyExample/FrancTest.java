package moneyExample;

import static org.junit.Assert.*;
import org.junit.Test;
import org.specbyexample.moneyexample.Money;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(3).equals(Money.franc(5)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }
}
