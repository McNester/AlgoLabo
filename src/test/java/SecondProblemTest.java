import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondProblemTest {
    @Test
    public void base() {
        int[] array = {3,2,4,1};
        assertEquals(2.5, Main.getAvg(array));
    }
    @Test
    public void positiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, Main.getAvg(array));
    }

    @Test
    public void negativeNumbers() {
        int[] array = {-5, -4, -3, -2, -1};
        assertEquals(-3.0, Main.getAvg(array));
    }

    @Test
    public void mixedNumbers() {
        int[] array = {-2, -1, 0, 1, 2};
        assertEquals(0.0, Main.getAvg(array));
    }

    @Test
    public void singleElement() {
        int[] array = {42};
        assertEquals(42.0, Main.getAvg(array));
    }
}
