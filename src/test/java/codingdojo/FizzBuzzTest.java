package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void Test_Assertion()
    {
        assertEquals("1", "1");
    }   
    
    @Test
    public void When_1_is_given_to_the_program_then_1_is_returned()
    {
        assertEquals(fizzbuzz.get(1), "1");
    }   
}
