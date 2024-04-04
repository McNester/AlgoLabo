import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FourthProblemTest {
    @Test
    public void base() {
        assertEquals(120, Main.getFactorial(5));
    }
    @Test
    public void zero() {
        assertEquals(1, Main.getFactorial(0));
    }
    @Test
    public void one() {
        assertEquals(1, Main.getFactorial(1));
    }

    @Test
    public void mediumNumber() {
        assertEquals(3628800, Main.getFactorial(10));
    }

}
