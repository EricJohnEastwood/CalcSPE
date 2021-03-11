import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import CalcSPE.Fact;


@RunWith(Parameterized.class)
public class FactTest {
    private static final double delta = 1e-15;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, { 8, 40320 }, { 10, 3628800 }
        });
    }

    @Parameter(0)
    public double input;

    @Parameter(1)
    public double expected;

    @BeforeClass
    public static void BeforeFactTestClass() {System.out.println("Started Testing Factorial "); }

    @Before
    public void BeforeFactTestCase() {System.out.println("Started Testing Factorial Case "); }

    @Test
    public void test() {
        assertEquals("Factorial ", expected, Fact.fact(input), delta);
    }

//    @After
//    public void AfterFactTestCase() {System.out.println("Finished Testing Factorial Case "); }

    @AfterClass
    public static void AfterFactTestClass() {System.out.println("Finished Testing Factorial "); }
}
