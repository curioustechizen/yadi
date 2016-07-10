package `in`.kiranrao.yadi

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by kiran on 6/14/16.
 */
class YadiKtTest {
    @Test
    fun anyOfFailure() {
        assertFalse("BANGALORE".anyOf("Banglore", "Bengaluru", "Blore"))
    }

    @Test
    fun anyOfSuccess() {
        assertTrue("Bangalore".anyOf("Bangalore", "Bengaluru", "Blore"))
    }

    @Test
    fun anyOfIgnoreCaseFailure() {
        assertFalse("BANGALORE".anyOf("Bangalor", "Bengaluru", "Blore") {a, b -> a.equals(b, true)})
    }

    @Test
    fun anyOfIgnoreCaseSuccess() {
        assertTrue("Bangalore".anyOf("Bangalore", "Bengaluru", "Blore") {a, b -> a.equals(b, true)})
    }

    @Test
    fun allOfWithoutPredicateSuccess() {

        val shouldBeAllowedToDrinkBeer: Boolean = true
        val drinkIsBeer: Boolean = true
        val ageIsAbove21: Boolean = true

        assertTrue(shouldBeAllowedToDrinkBeer.allOf(drinkIsBeer, ageIsAbove21))
    }

    @Test
    fun allOfIgnoreCaseSuccess() {
        assertTrue("Made In India".allOf("MADE IN iNdIa", "MaDE In iNDIA", "MADE IN INDIA"){a, b -> a.equals(b, true)})
    }

    @Test
    fun allOfIgnoreCaseFailure() {
        assertFalse("Made In India".allOf("iNdIa", "MaDE In iNDIA", "MADE IN INDIA"){a, b -> a.equals(b, true)})
    }

    @Test
    fun noneOfSuccess() {
        assertTrue("Made In India".noneOf("iNdIa", "MaDE In iNDIA", "MADE IN INDIA"))
    }

    @Test
    fun noneOfFailure() {
        assertFalse("Made In India".noneOf("iNdIa", "Made In India", "MADE IN INDIA"))
    }

    @Test
    fun noneOfIgnoreCaseFailure() {
        assertFalse("Made In India".noneOf("iNdIa", "MaDE In iNDIA", "MADE IN INDIA"){a, b -> a.equals(b, true)})
    }
}