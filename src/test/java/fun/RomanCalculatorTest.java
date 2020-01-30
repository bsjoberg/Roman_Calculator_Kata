package fun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTest {

    @Test
    public void should_convert_Roman_to_int() {
        assertEquals(1, RomanCalculator.toInt("I"));
        assertEquals(2, RomanCalculator.toInt("II"));
        assertEquals(3, RomanCalculator.toInt("III"));
    }

    @Test
    public void should_convert_complicated_Roman_to_int() {
        assertEquals(4, RomanCalculator.toInt("IV"));
    }

    @Test
    public void should_convert_int_to_Roman() {
        assertEquals("II", RomanCalculator.toRoman(2));
        assertEquals("III", RomanCalculator.toRoman(3));
        assertEquals("VIII", RomanCalculator.toRoman(8));
    }

    @Test
    public void should_convert_int_using_subtractive_Roman() {
        assertEquals("IV", RomanCalculator.toRoman(4));
    }
}
