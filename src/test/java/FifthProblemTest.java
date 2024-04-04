import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FifthProblemTest {
    @Test
    public void base() {
        assertEquals(5, Main.findFibonacciElement(5));
        assertEquals(1597, Main.findFibonacciElement(17));
    }
    @Test
    public void zero() {
        assertEquals(0, Main.findFibonacciElement(0));
    }

    @Test
    public void one() {
        assertEquals(1, Main.findFibonacciElement(1));
    }

    @Test
    public void smallPosition() {
        assertEquals(1, Main.findFibonacciElement(2));
    }

    @Test
    public void mediumPosition() {
        assertEquals(21, Main.findFibonacciElement(8));
    }

    @Test
    public void largePosition() {
        assertEquals(832040, Main.findFibonacciElement(30));
    }
}
