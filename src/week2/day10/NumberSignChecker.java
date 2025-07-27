package week2.day10;
import java.util.Scanner;

public class NumberSignChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		double num = input.nextDouble();
		String result = checkSign(num);
		System.out.println("The number is: " + result);
		input.close();
	}
	public static String checkSign(double num) {
		if (num > 0) {
			return "Positive";
		} else if (num < 0) {
			return "Negative";
		} else {
			return "Zero";
		}
	}
}
