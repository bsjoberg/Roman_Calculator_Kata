package fun;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Steps {
    private HelloWorld helloWorld;
    private String message;

    @Given("Hello World exists")
    public void hello_World_exists() {
        helloWorld = new HelloWorld();
    }

    @When("I say hi")
    public void i_say_hi() {
        message = helloWorld.sayHi();
    }

    @Then("I hear {string}")
    public void i_hear(String expectedString) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedString, message);
    }

}
