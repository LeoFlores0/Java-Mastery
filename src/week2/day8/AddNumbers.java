package week2.day8;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = input.nextInt();
		System.out.println("Enter number 2:");
		int b = input.nextInt();
		input.close();	
		int result = addNumbers(a, b);
		System.out.println("The sum of " + a + " and " + b + " is " + result);

	}
	public static int addNumbers(int a, int b) {
		return a + b;
	}
}
