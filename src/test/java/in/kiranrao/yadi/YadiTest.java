package in.kiranrao.yadi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kiran on 3/20/16.
 */
public class YadiTest {

    @Test
    public void testAllOfStringSuccess() throws Exception {
        assertTrue(Yadi.anyOf("Bangalore", "Bengaluru", "Bangalore", "Bendakaalooru"));
    }

    @Test
    public void testAnyOfIgnoreCaseSuccess() throws Exception {
        assertTrue(Yadi.anyOfIgnoreCase("BANGALORE", "Bengaluru", "Bangalore", "Bendakaalooru"));
    }
}
