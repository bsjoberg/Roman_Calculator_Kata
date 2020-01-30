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
    public void should_convert_int_to_Roman() {
        assertEquals("II", RomanCalculator.toRoman(2));
        assertEquals("III", RomanCalculator.toRoman(3));
    }

    @Test
    public void should_convert_using_subtractive_Roman_to_int() {

    }
}
