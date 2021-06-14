package assignment2;

import assignment2.ex24.base.ex24;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test24 {
    @Test

    public void testIsAnagramIfAnagram() {
        ex24 ana = new ex24();

        boolean actual = ana.isAnagram("note", "tone");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsAnagramIfNotAnagram() {
        ex24 ana = new ex24();

        boolean actual = ana.isAnagram("meow", "tone");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
