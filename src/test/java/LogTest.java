import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import CalcSPE.Log;

@RunWith(Parameterized.class)
public class LogTest {
    private static final double delta = 1e-15;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 15, 2.70805020110221 }, { 1, 0 }, { 10, 2.302585092994046 }, { 256, 5.545177444479562 }, { -5, Double.NaN}
        });
    }

    @Parameter(0)
    public double input;

    @Parameter(1)
    public double expected;


    @BeforeClass
    public static void BeforeLogTestClass() {System.out.println("Started Testing Log "); }

    @Test
    public void test() {
        assertEquals("Natural Logarithm ", expected, Log.log(input), delta);
    }

    @AfterClass
    public static void AfterLogTestClass() {System.out.println("Finished Testing Log "); }
}