import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TenthProblemTest {

    @Test
    public void base(){
        assertEquals(16,Main.findGCD(32,48));
        assertEquals(1,Main.findGCD(10,7));
    }
    @Test
    public void firstZeroSecondNonZero() {
        assertEquals(5, Main.findGCD(0, 5));
    }

    @Test
    public void firstNonZeroSecondZero() {
        assertEquals(5, Main.findGCD(5, 0));
    }

    @Test
    public void coprimeNumbers() {
        assertEquals(1, Main.findGCD(9, 28));
    }

    @Test
    public void commonFactor() {
        assertEquals(4, Main.findGCD(8, 12));
    }

    @Test
    public void largeNumbers() {
        assertEquals(21, Main.findGCD(1071, 462));
    }

    @Test
    public void negativeNumbers() {
        assertEquals(5, Main.findGCD(-10, 5));
    }

}
