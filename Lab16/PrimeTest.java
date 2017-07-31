import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {


    @Test
    public void isPrime2() {
        assertTrue("Two is a prime number", Prime.isPrime(2));
    }

    @Test
    public void isPrime79() {
        assertTrue("79 is a prime number", Prime.isPrime(79));
    }

    @Test
    public void isPrime129() {
        assertFalse("129 is not a prime number.", Prime.isPrime(129));
    }

    @Test
    public void find4thPrime() {
        int expected = 7;
        int actual = Prime.nthPrime(4);
        assertEquals("Not 7.", expected, actual);
    }

    @Test
    public void find2ndPrime() {
        assertEquals("Not 3", 3, Prime.nthPrime(2));
    }

    @Test
    public void find12thPrime() {
        assertEquals("not 37", 37, Prime.nthPrime(12));
    }
}
