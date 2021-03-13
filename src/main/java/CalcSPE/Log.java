package CalcSPE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;

public class Log {

    private static final Logger logger = LogManager.getLogger(Log.class);

    public static double log(double value_1) {
        logger.info("Log - " + value_1);
        double result = Math.log(value_1);
        logger.info("RESULT - Log = " + result);
        return result;
    }
}
