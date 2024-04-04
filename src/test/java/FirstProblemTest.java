import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstProblemTest {

    @Test
    void baseCase(){
        int[] arr = {10,1,32,3,45};
        assertEquals(1,Main.getMin(arr));
    }
    @Test
    public void mixedNumbers() {
        int[] array = {1, -1, 2, -2, 0};
        assertEquals(-2, Main.getMin(array));
    }

    @Test
    public void allPositiveNumbers() {
        int[] array = {5, 1, 4, 2, 3};
        assertEquals(1, Main.getMin(array));
    }

    @Test
    public void allNegativeNumbers() {
        int[] array = {-1, -4, -3, -5, -2};
        assertEquals(-5, Main.getMin(array));
    }

    @Test
    public void singleElement() {
        int[] array = {42};
        assertEquals(42, Main.getMin(array));
    }

}
