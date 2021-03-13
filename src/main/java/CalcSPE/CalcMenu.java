package CalcSPE;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.InputMismatchException;



public class CalcMenu {

    // constructor
    public CalcMenu() {
    }

    private static final Logger logger = LogManager.getLogger(CalcMenu.class);

    public static void main(String[] args) {
        // System.out.println("hello");
        Scanner scanner = new Scanner(System.in);

        double value_1,value_2;
        int choice;

        while(true) {
            System.out.println("Calculator Main Menu");
            System.out.print("Press \n1. Square root \n2. Factorial \n3. Natural Logarithm \n4. Power \n");
            System.out.print("Press any other key to exit \nEnter Choice : \n");
            

            //  choice input
            try {
                choice = scanner.nextInt();
                logger.info("choice Entered ! " + choice);
            } catch (InputMismatchException error) {
                return;
            }


            switch (choice) {
                case 1:
                    // Square Root
                    try {
                        System.out.print("Enter the number : \n");
                        value_1 = scanner.nextDouble();
                        logger.info("value Entered = " + value_1);
                    } catch (InputMismatchException error) {
                        logger.error("Input Not a number");
                        return;
                    }
                    System.out.println("Square Root of " + value_1 + " is : " + Sqrt.sqrt(value_1));
                    break;
                case 2:
                    // Factorial
                    try {
                        System.out.print("Enter the number : \n");
                        value_1 = scanner.nextInt();
                        logger.info("value Entered = " + value_1);
                    } catch (InputMismatchException error) {
                        logger.error("Input Not a number");
                        return;
                    }
                    System.out.println("Factorial of " + value_1 + " is : " + Fact.fact(value_1));
                    break;
                case 3:
                    // Natural logarithm
                    try {
                        System.out.print("Enter the number : \n");
                        value_1 = scanner.nextDouble();
                        logger.info("value Entered = " + value_1);
                    } catch (InputMismatchException error) {
                        logger.error("Input Not a number");
                        return;
                    }
                    System.out.println("Natural Logarithm of " + value_1 + " is : " + Log.log(value_1));
                    break;
                case 4:
                    // Power
                    try {
                        System.out.print("Enter the base : \n");
                        value_1 = scanner.nextDouble();
                        logger.info("value1 Entered = " + value_1);

                        System.out.print("Enter the exponent : \n");
                        value_2 = scanner.nextDouble();
                        logger.info("value2 Entered = " + value_2);

                    } catch (InputMismatchException error) {
                        logger.error("Input Not a number");
                        return;
                    }
                    System.out.println("Power for base " + value_1 + " with exponent " + value_2 + " is : " + Power.power(value_1, value_2));
                    break;
                default:
                    System.out.println("Exiting Application ...");
                    logger.info("Exiting Application ! ");
                    return;
            }
        }
    }
}
