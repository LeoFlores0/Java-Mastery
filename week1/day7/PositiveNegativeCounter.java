package week1.day7;
import java.util.Scanner;

public class PositiveNegativeCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int num = input.nextInt();
		int[] numbers = new int[num];
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for (int i = 0; i < num; i++) {
			if (numbers[i] > 0) {
				pos++;
			} else if (numbers[i] == 0) {
				zero++;
			} else {
				neg++;
			}
		}
		System.out.println("Positive numbers: " + pos);
		System.out.println("Negative numbers: " + neg);
		System.out.println("Zeros: " + zero);
		input.close();
	}

}
