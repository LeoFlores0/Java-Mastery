package week2.day10;
import java.util.Scanner;

public class MaxOfThreeNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = input.nextInt();
		System.out.println("Enter number 2:");
		int b = input.nextInt();
		System.out.println("Enter number 3:");
		int c = input.nextInt();
		int result = findMax(a, b, c);
		System.out.println("Max is: " + result);
		input.close();

	}
	public static int findMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;	
			}
}