import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import CalcSPE.Sqrt;

@RunWith(Parameterized.class)
public class SqrtTest {
    private static final double delta = 1e-15;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 1 }, { 2, 1.4142135623730951 }, { 9, 3 }, { 256, 16 }, { -5, new Double(Double.NaN) }
        });
    }

    @Parameter(0)
    public double input;
    @Parameter(1)
    public double expected;

    @BeforeClass
    public static void BeforeSqrtTestClass() {System.out.println("Started Testing Sqrt "); }

    @Test
    public void test() {
        assertEquals("Square Root ", expected, Sqrt.sqrt(input), delta);
    }

    @AfterClass
    public static void AfterSqrtTestClass() {System.out.println("Finished Testing Sqrt "); }
}