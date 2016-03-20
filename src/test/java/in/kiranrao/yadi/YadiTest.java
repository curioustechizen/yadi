package in.kiranrao.yadi;

import org.junit.Test;

import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import static org.junit.Assert.*;

/**
 * Created by kiran on 3/20/16.
 */
public class YadiTest {
    @Test
    public void testAnyOfIgnoreCaseSuccess() throws Exception {
        assertTrue(Yadi.anyOfIgnoreCase("BANGALORE", "Bengaluru", "Bangalore", "Blore"));
    }

    @Test
    public void testAnyOfEnum() throws Exception{
        assertTrue(Yadi.anyOf(MONDAY, SATURDAY, SUNDAY, MONDAY));
    }
}
