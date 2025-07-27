package week2.day10;
import java.util.Scanner;

public class IsEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = input.nextInt();
		if (isEven(a)) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		input.close();
	}
	public static Boolean isEven (int a) {
		return a % 2 == 0;
	}
}
