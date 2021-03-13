package CalcSPE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;

public class Sqrt {

    private static final Logger logger = LogManager.getLogger(Sqrt.class);

    public static double sqrt(double value_1) {
        logger.info("Sqrt - " + value_1);
        double result = Math.sqrt(value_1);
        logger.info("RESULT - Sqrt = " + result);
        return result;
    }
}
