package assignment2;

import assignment2.ex27.base.ex27;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test27 {
    @Test
    public void testValidateFirstName() {
        ex27 twenty7 = new ex27();

        int actual = twenty7.validateFirstName("J");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testValidateLastName() {
        ex27 twenty7 = new ex27();

        int actual = twenty7.validateLastName("");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testValidateZip() {
        ex27 twenty7 = new ex27();

        int actual = twenty7.validateZip("556g6");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testValidateId() {
        ex27 twenty7 = new ex27();

        int actual = twenty7.validateId("AB-34a5");
        int expected = 2;

        assertEquals(expected, actual);
    }
}
