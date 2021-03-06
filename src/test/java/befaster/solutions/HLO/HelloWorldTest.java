package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private HelloSolution helloSolution;

    @Before
    public void setUp() {
        helloSolution = new HelloSolution();
    }

    @Test
    public void should_print_hello_world() {
        assertThat(helloSolution.hello("test"), equalTo("Hello, test!"));
    }

    @Test(expected = FriendNameCantBeNullException.class)
    public void should_fail_when_friend_name_is_null() {
        helloSolution.hello(null);
    }
}
