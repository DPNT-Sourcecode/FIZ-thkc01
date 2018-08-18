package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class FizTest {

    private FizzBuzzSolution solution;

    @Before
    public void setUp() {
        solution = new FizzBuzzSolution();
    }

    @Test
    public void number_is_multiple_of_three_and_five_is_odd_and_has_a_five() {
        assertThat("fizz buzz fake deluxe", equalTo(solution.fizzBuzz(15)));
        assertThat("fizz buzz fake deluxe", equalTo(solution.fizzBuzz(555)));
    }

    @Test
    public void number_is_multiple_of_three() {
        assertThat("fizz", equalTo(solution.fizzBuzz(18)));
    }

    @Test
    public void number_is_multiple_of_five_and_is_odd_and_contains_five_should_return_buzz_fake_deluxe() {
        assertThat("buzz fake deluxe", equalTo(solution.fizzBuzz(25)));
    }

    //
    @Test
    public void number_is_not_multiple_of_five_or_three_should_return_the_number() {
        assertThat("1", equalTo(solution.fizzBuzz(1)));
        assertThat("11", equalTo(solution.fizzBuzz(11)));
        assertThat("22", equalTo(solution.fizzBuzz(22)));
        assertThat("1111", equalTo(solution.fizzBuzz(1111)));

    }

    @Test
    public void should_return_fizz_when_number_contains_a_three() {
        assertThat("fizz", equalTo(solution.fizzBuzz(31)));
    }

    @Test
    public void should_return_buzz_when_number_contains_a_five() {
        assertThat("buzz", equalTo(solution.fizzBuzz(56)));
    }

    @Test
    public void should_return_fizz_buzz_when_number_contains_three_and_five() {
        assertThat("fizz buzz", equalTo(solution.fizzBuzz(546)));
    }

    @Test
    public void should_return_fizz_deluxe() {
        assertThat("fizz fake deluxe", equalTo(solution.fizzBuzz(3)));
    }

    @Test
    public void should_return_buzz_deluxe() {
        assertThat("buzz fake deluxe", equalTo(solution.fizzBuzz(5)));
    }

}
