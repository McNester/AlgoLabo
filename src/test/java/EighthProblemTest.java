import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class EighthProblemTest {

    @Test
    public void emptyString() {
        assertFalse(Main.isAllDigits(""));
    }

    @Test
    public void onlyDigits() {
        assertTrue(Main.isAllDigits("12345"));
    }

    @Test
    public void startsWithDigitEndsWithNonDigit() {
        assertFalse(Main.isAllDigits("12345a"));
    }

    @Test
    public void startsWithNonDigitEndsWithDigit() {
        assertFalse(Main.isAllDigits("a12345"));
    }

    @Test
    public void containsNonDigits() {
        assertFalse(Main.isAllDigits("123x456"));
    }

    @Test
    public void singleDigit() {
        assertTrue(Main.isAllDigits("7"));
    }
}
