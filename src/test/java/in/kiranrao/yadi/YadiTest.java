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
    public void testAnyOfIgnoreCaseFailure() throws Exception {
        assertFalse(Yadi.anyOfIgnoreCase("BANGALORE", "Bengaluru", "Bangalre", "Blore"));
    }

    @Test
    public void testAnyOfEnum() throws Exception{
        assertTrue(Yadi.anyOf(MONDAY, SATURDAY, SUNDAY, MONDAY));
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


}
