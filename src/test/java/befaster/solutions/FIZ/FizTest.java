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
    public void number_is_multiple_of_three_and_five() {
        assertThat("fizz buzz", equalTo(solution.fizzBuzz(15)));
    }

    @Test
    public void number_is_multiple_of_three() {
        assertThat("fizz", equalTo(solution.fizzBuzz(18)));
    }

    @Test
    public void number_is_multiple_of_five() {
        assertThat("buzz", equalTo(solution.fizzBuzz(25)));
    }
//
    @Test
    public void number_is_not_multiple_of_five_or_three_should_return_the_number() {
        assertThat("1", equalTo(solution.fizzBuzz(1)));
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

}
