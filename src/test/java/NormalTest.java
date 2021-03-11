
import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

import CalcSPE.Power;
import CalcSPE.Log;

public class NormalTest {

    @Before
    public void BeforeNormalTestCase() {System.out.println("Started Testing on all cases "); }

    @Test
    public void LogTestSpecial() {
        assertTrue("Natural Logarithm", 0 - Log.log(1) == 0);
    }


    @Test
    public void PowerSpecialTest() {
        assertFalse("Power", Power.power(0,5) == 10);
    }

    @After
    public void AfterNormalTestCase() {System.out.println("Finished Testing on all cases "); }

}
