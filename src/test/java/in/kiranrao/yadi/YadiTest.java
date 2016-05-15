package in.kiranrao.yadi;

import org.junit.Test;

import static java.lang.Thread.State.*;
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
    public void testAnyOfIgnoreCaseFailure() throws Exception {
        assertFalse(Yadi.anyOfIgnoreCase("BANGALORE", "Bengaluru", "Bangalre", "Blore"));
    }

    @Test
    public void testAnyOfEnum() throws Exception{
        assertTrue(Yadi.anyOf(RUNNABLE, NEW, RUNNABLE, BLOCKED, TERMINATED));
    }

    @Test
    public void testAnyOfEnumFailure() throws Exception{
        assertFalse(Yadi.anyOf(RUNNABLE, NEW, BLOCKED, TERMINATED));
    }

    @Test
    public void testAllOfWithoutPredicateSuccess() throws Exception {

        boolean shouldBeAllowedToDrinkBeer = true;
        boolean drinkIsBeer = true;
        boolean ageIsAbove21 = true;

        assertTrue(Yadi.allOf(shouldBeAllowedToDrinkBeer, drinkIsBeer, ageIsAbove21));
    }

    @Test
    public void testAllOfIgnoreCaseSuccess() throws Exception {
        assertTrue(Yadi.allOfIgnoreCase("Made In India", "MADE IN iNdIa", "MaDE In iNDIA", "MADE IN INDIA"));
    }

    @Test
    public void testAllOfIgnoreCaseFailure() throws Exception {
        assertFalse(Yadi.allOfIgnoreCase("Made In India", "iNdIa", "MaDE In iNDIA", "MADE IN INDIA"));
    }

    @Test
    public void testNoneOfSuccess() throws Exception {
        assertTrue(Yadi.noneOf("Made In India", "iNdIa", "MaDE In iNDIA", "MADE IN INDIA"));
    }

    @Test
    public void testNoneOfFailure() throws Exception {
        assertFalse(Yadi.noneOf("Made In India", "iNdIa", "Made In India", "MADE IN INDIA"));
    }

    @Test
    public void testNoneOfIgnoreCaseFailure() throws Exception {
        assertFalse(Yadi.noneOfIgnoreCase("Made In India", "iNdIa", "MaDE In iNDIA", "MADE IN INDIA"));
    }
}
