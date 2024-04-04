import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class NinthProblemTest {
    @Test
    public void baseCases() {
        assertEquals(2,Main.findBinomial(2,1));
        assertEquals(35,Main.findBinomial(7,3));
        assertEquals(1, Main.findBinomial(0, 0));
        assertEquals(1, Main.findBinomial(5, 0));
        assertEquals(1, Main.findBinomial(5, 5));
    }

    @Test
    public void smallValues() {
        assertEquals(10, Main.findBinomial(5, 2));
    }

    @Test
    public void mediumValues() {
        assertEquals(252, Main.findBinomial(10, 5));
    }
}
