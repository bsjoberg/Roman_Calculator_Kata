package fun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTest {

    @Test
    public void should_convert_Roman_to_int() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals(1, calculator.toInt("I"));
        assertEquals(2, calculator.toInt("II"));
        assertEquals(3, calculator.toInt("III"));
    }

    @Test
    public void should_convert_int_to_Roman() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals("II", calculator.toRoman(2));
        assertEquals("III", calculator.toRoman(3));
    }
}
