package fun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloTests {

    @Test
    public void should_say_hi() {
        assertEquals("Hello World!", new HelloWorld().sayHi());
    }
}
