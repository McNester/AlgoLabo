import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SixthProblemTest {
    @Test
    public void base() {
        assertEquals(1024, Main.findPower(2, 10));
    }
    @Test
    public void powerOfZero() {
        assertEquals(1, Main.findPower(2, 0));
    }

    @Test
    public void zeroPowerOfAnyNumber() {
        assertEquals(0, Main.findPower(0, 5));
    }

    @Test
    public void onePowerOfAnyNumber() {
        assertEquals(1, Main.findPower(1, 100));
    }

    @Test
    public void anyNumberPowerOfOne() {
        assertEquals(5, Main.findPower(5, 1));
    }

    @Test
    public void smallNumberPower() {
        assertEquals(16, Main.findPower(2, 4));
    }

    @Test
    public void largeNumberPower() {
        assertEquals(1073741824, Main.findPower(2, 30));
    }

    @Test
    public void negativePower(){
        assertEquals(0.25,Main.findPower(2,-2));
    }
}
