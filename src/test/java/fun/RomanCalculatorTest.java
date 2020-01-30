package fun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTest {

    @Test
    public void should_convert_Roman_to_int() {
        RomanCalculator calculator = new RomanCalculator();
        assertEquals(1, calculator.toInt("I"));
    }
}
