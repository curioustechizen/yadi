package in.kiranrao.yadi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kiran on 3/20/16.
 */
public class YadiTest {

    @Test
    public void testAllOfIntSuccess() throws Exception {
        final int ONE = 1;
        final int ONDU = 1;
        final int EK = 1;

        assertTrue(Yadi.allOf(1, ONDU, ONDU, EK));
    }

    @Test
    public void testAllOfIntFailure() throws Exception {
        final int ONE = 1;
        final int TWO = 2;

        assertFalse(Yadi.allOf(1, ONE, TWO));
    }

    @Test
    public void testAllOfStringSuccess() throws Exception {
        assertTrue(Yadi.anyOf("Bangalore", "Bengaluru", "Bangalore", "Bendakaalooru"));
    }

    @Test
    public void testAnyOfIgnoreCaseSuccess() throws Exception {
        assertTrue(Yadi.allOfIgnoreCase("BANGALORE", "Bengaluru", "Bangalore", "Bendakaalooru"));
    }
}
