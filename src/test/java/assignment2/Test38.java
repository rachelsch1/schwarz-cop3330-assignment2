package assignment2;

import assignment2.ex38.base.ex38;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test38 {
    static int[] input = {1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    public void testAverage() {
        ex38 thirty8 = new ex38();

        Integer[] actual = thirty8.filterEvenNumbers(input);
        Integer[] expected = {2, 4, 6, 8};

        assertEquals(expected, actual);
    }
}
