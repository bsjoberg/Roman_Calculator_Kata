package fun;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorSteps {
    private String result;

    @Given("I have a roman calculator")
    public void i_have_a_roman_calculator() {
        new RomanCalculator();
    }

    @When("I add {string} and {string}")
    public void i_add_and(String first, String second) {
        result = RomanCalculator.add(first, second);
    }

    @Then("I expect {string}")
    public void i_expect(String expectedValue) {
        assertEquals(expectedValue, result);
    }
}
