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
        final int [] INPUT = {1, ONDU, ONE, EK};
        final int SUBJECT = 1;
        assertTrue(Yadi.allOf(SUBJECT, INPUT));
    }

}
