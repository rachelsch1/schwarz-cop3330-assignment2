package assignment2;

import assignment2.ex36.base.ex36;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class Test36 {
    static ArrayList<Integer> list = new ArrayList<Integer>() {
        {
            add(100);
            add(200);
            add(1000);
            add(300);
        }
    };


    @Test
    public void testAverage() {
        ex36 thirty6 = new ex36();

        double actual = thirty6.average(list);
        double expected = 400.00;
        double delta = 0.01;

        assertEquals(expected, actual, delta);
    }

    @Test
    public void testMax() {
        ex36 thirty6 = new ex36();

        int actual = thirty6.max(list);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void testMin() {
        ex36 thirty6 = new ex36();

        int actual = thirty6.min(list);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testStd() {
        ex36 thirty6 = new ex36();

        double actual = thirty6.std(list);
        double expected = 353.55;
        double delta = 0.01;

        assertEquals(expected, actual, delta);
    }
}
