package week2.day8;
import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to square: ");;
		int number = input.nextInt();
		int result = squareNumber(number);
		System.out.println("The square of " + number + " is " + result);
		input.close();

	}
	public static int squareNumber(int number) {
		return number * number;		
	}
}
