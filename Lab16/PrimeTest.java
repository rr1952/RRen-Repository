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
    public void isPrime5() {
        assertTrue("5 is indeed prime.", Prime.isPrime(5));
    }

}
