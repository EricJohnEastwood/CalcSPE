import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import CalcSPE.Power;

@RunWith(Parameterized.class)
public class PowerTest {
    private static final double delta = 1e-15;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 5, 0 }, { 1, 5, 1 }, { 8, 2, 64 }, { 3.5, 6.7, 4418.307083491861 }, { 8, -1.5, 0.04419417382415922 }, { 10, 0, 1 }
        });
    }

    @Parameter(0)
    public double base;

    @Parameter(1)
    public double exponent;

    @Parameter(2)
    public double expected;

    @BeforeClass
    public static void BeforePowerTestClass() {System.out.println("Started Testing Power "); }

    @Test
    public void test() {
        assertEquals("Power ", expected, Power.power(base, exponent), delta);
    }


    @AfterClass
    public static void AfterPowerTestClass() {System.out.println("Finished Testing Power "); }
}