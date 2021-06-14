package assignment2;

import assignment2.ex25.base.ex25;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

public class Test25 {
    @Test
    public void testPasswordValidatorIfVeryWeak() {
        ex25 twenty5 = new ex25();

        int actual = twenty5.passwordValidator("199900");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordValidatorIfWeak() {
        ex25 twenty5 = new ex25();

        int actual = twenty5.passwordValidator("abcde");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordValidatorIfStrong() {
        ex25 twenty5 = new ex25();

        int actual = twenty5.passwordValidator("abc99abc1");
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordValidatorIfVeryStrong() {
        ex25 twenty5 = new ex25();

        int actual = twenty5.passwordValidator("abc9$$d!!");
        int expected = 4;

        assertEquals(expected, actual);
    }
}
