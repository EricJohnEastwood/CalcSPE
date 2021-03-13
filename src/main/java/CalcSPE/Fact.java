package CalcSPE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fact {

    private static final Logger logger = LogManager.getLogger(Fact.class);

    public static double fact(double value_1) {
        double result = 1.0;
        logger.info("Fact - " + value_1);
        for (double factor = 2; factor <= value_1; factor++) {
            result = result * factor;
        }
        logger.info("RESULT - Fact = " + result);
        return result;
    }
}
