import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class SeventhProblemTest {
    @Test
    public void base() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,4,6,2));
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(2,6,4,1));
        assertEquals(expected, Main.reverseList(list));
        System.out.println(list);

    }
    @Test
    public void emptyList() {
        assertEquals(new LinkedList<>(), Main.reverseList(new LinkedList<>()));
    }

    @Test
    public void singleElement() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1));
        assertEquals(list, Main.reverseList(list));
    }

    @Test
    public void twoElements() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2));
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(2, 1));
        assertEquals(expected, Main.reverseList(list));
    }

    @Test
    public void multipleElements() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(expected, Main.reverseList(list));
    }
}
