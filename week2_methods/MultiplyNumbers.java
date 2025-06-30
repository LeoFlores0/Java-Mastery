package week2.day9;
import java.util.Scanner;

public class MultiplyNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		double a = input.nextDouble();
		System.out.println("Enter number 2: ");
		double b = input.nextDouble();
		double result = multiplyNumbers(a, b);
		System.out.println(a + " times " + b + " is " + result);
		input.close();
	}
	public static double multiplyNumbers(double a, double b) {
		return a * b;
	}
}