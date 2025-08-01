import java.util.Scanner;
/**
 * Simple calculator that reads two numbers and an arithmetic operator from the console,
 * performs the calculation, and prints the result.
 * Supported operations: addition (+), subtraction (-), multiplication (*), division (/).
 * Division by zero is checked and an error message is displayed if attempted.
 *
 * Example usage:
 * Enter first number: 10
 * Enter operation (+, -, *, /): +
 * Enter second number: 5
 * Your answer: 15
 * @param args Command line arguments (not used)
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numberOne = consoleIn.nextInt();

        System.out.println("Enter symbol (+, -, *, /): ");
        String symbol = consoleIn.next();

        System.out.println("Enter number two: ");
        int numberTwo = consoleIn.nextInt();

        int result = 0;

        if ("+".equals(symbol)) {
            result = numberOne + numberTwo;
        } else if ("-".equals(symbol)) {
            result = numberOne - numberTwo;
        } else if ("*".equals(symbol)) {
            result = numberOne * numberTwo;
        } else if ("/".equals(symbol)) {
            if (numberTwo == 0) {
                System.out.println("Error: Division by zero!");
            } else {
                result = numberOne / numberTwo;
            }
        }
        System.out.println("Your answer: " + result);

        consoleIn.close();

    }
}
