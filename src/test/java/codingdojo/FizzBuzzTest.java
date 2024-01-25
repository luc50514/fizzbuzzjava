package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void When_1_is_given_to_the_program_then_1_is_returned()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("1", fizzbuzz.get(1));
    }

    @Test
    public void When_2_is_given_to_the_program_then_2_is_returned()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("2", fizzbuzz.get(2));
    }

    @Test
    public void When_3_is_given_to_the_program_then_Fizz_is_returned()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("Fizz", fizzbuzz.get(3));
    }

    @Test
    public void When_6_is_given_to_the_program_then_Fizz_is_returned()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("Fizz", fizzbuzz.get(6));
    }
    
    @Test
    public void When_5_is_given_to_the_program_then_Buzz_is_returned()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("Buzz", fizzbuzz.get(5));
    }
    
    @Test
    public void When_10_is_given_to_the_program_then_Buzz_is_returned()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("Buzz", fizzbuzz.get(10));
    }
    
    @Test
    public void When_15_is_given_to_the_program_then_FizzBuzz_is_returned()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("FizzBuzz", fizzbuzz.get(15));
    }
}
