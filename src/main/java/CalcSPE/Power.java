package CalcSPE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;

public class Power {

    private static final Logger logger = LogManager.getLogger(Power.class);

    public static double power(double value_1, double value_2) {
        logger.info("Power - base " + value_1 + " and exponent " + value_2);
        double result = Math.pow(value_1, value_2);
        logger.info("RESULT - Power = " + result);
        return result;
    }
}
