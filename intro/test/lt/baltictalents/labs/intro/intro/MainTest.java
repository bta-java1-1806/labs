package lt.baltictalents.labs.intro.intro;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() /*throws Exception*/ {
        // TODO: [@gsm] 18.5.31 capture System.out
    }

    @After
    public void tearDown() /*throws Exception*/ {
        // TODO: [@gsm] 18.5.31 restore System.out
    }

    @org.junit.Test
    public void main() {
        Assert.assertThat(true, is(true));
        // TODO: [@gsm] 18.5.31 test output
    }


}