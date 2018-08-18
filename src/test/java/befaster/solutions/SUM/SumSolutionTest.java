package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }

    @Test(expected = NumberTooLowerException.class)
    public void param_is_lower_than_zero_should_fail(){
        sum.compute(-5,10);
    }

    @Test(expected = NumberTooHighException.class)
    public void param_is_higher_than_100_should_fail(){
        sum.compute(5,101);
    }
    
}
