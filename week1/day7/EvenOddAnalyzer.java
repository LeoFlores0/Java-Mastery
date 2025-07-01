package week1.day7;
import java.util.Scanner;

public class EvenOddAnalyzer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int store = input.nextInt();
		int[] numbers = new int[store];
		for (int i = 0; i < store; i++) {
			System.out.println("Enter number "+ (i + 1) + ":");
			numbers[i] = input.nextInt();
		}
		for (int i = 0; i < store; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.println(numbers[i] + " is odd");
			} else {
				System.out.println(numbers[i] + " is even");
			}
		} input.close();
	}

}
