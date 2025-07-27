package week2.day9;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = input.nextDouble();
        System.out.println("Enter second number:");
        double b = input.nextDouble();
        input.nextLine(); // consume leftover newline

        System.out.println("Enter operation (+, -, *, /):");
        String operation = input.nextLine();

        double result = 0;

        if (operation.equals("+")) {
            result = add(a, b);
        } else if (operation.equals("-")) {
            result = subtract(a, b);
        } else if (operation.equals("*")) {
            result = multiply(a, b);
        } else if (operation.equals("/")) {
            result = divide(a, b);
        } else {
            System.out.println("Invalid operation.");
            input.close();
            return;
        }

        System.out.println("Result: " + result);
        input.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}