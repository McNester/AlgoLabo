import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThirdProblemTest {
    @Test
    public void base() {
        assertFalse(Main.isPrime(10));
        assertTrue(Main.isPrime(7));
    }
    @Test
    public void negativeNumber() {
        assertFalse(Main.isPrime(-5));
    }

    @Test
    public void zero() {
        assertFalse(Main.isPrime(0));
    }

    @Test
    public void one() {
        assertFalse(Main.isPrime(1));
    }

    @Test
    public void two() {
        assertTrue(Main.isPrime(2));
    }

    @Test
    public void primeNumber() {
        assertTrue(Main.isPrime(29));
    }

    @Test
    public void nonPrimeNumber() {
        assertFalse(Main.isPrime(4));
    }

    @Test
    public void largePrimeNumber() {
        assertTrue(Main.isPrime(7919));
    }

    @Test
    public void largeNonPrimeNumber() {
        assertFalse(Main.isPrime(7920));
    }
}
