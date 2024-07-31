package fun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanCalculatorTest {

    @Test
    public void should_convert_Roman_to_int() {
        assertEquals(1, RomanCalculator.fromRomanToInt("I"));
        assertEquals(2, RomanCalculator.fromRomanToInt("II"));
        assertEquals(3, RomanCalculator.fromRomanToInt("III"));
        assertEquals(6, RomanCalculator.fromRomanToInt("VI"));
        assertEquals(10, RomanCalculator.fromRomanToInt("X"));
    }

    @Test
    public void should_convert_complicated_Roman_to_int() {
        assertEquals(4, RomanCalculator.fromRomanToInt("IV"));
        assertEquals(9, RomanCalculator.fromRomanToInt("IX"));
    }

    @Test
    public void should_convert_int_to_Roman() {
        assertEquals("II", RomanCalculator.fromIntToRoman(2));
        assertEquals("III", RomanCalculator.fromIntToRoman(3));
        assertEquals("VIII", RomanCalculator.fromIntToRoman(8));
    }

    @Test
    public void should_convert_int_using_subtractive_Roman() {
        assertEquals("IV", RomanCalculator.fromIntToRoman(4));
        assertEquals("IX", RomanCalculator.fromIntToRoman(9));
    }
}
