package week2.day11;
import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers will be entered:");
		int nums = input.nextInt();
		int[] arr = new int[nums];
		for (int i = 0; i < nums; i++) {
			System.out.println("Enter number " + (i + 1) + " :");
			arr[i] = input.nextInt();
		}
			int result = findMax(arr);
			System.out.println("The max is: " + result);
			input.close();
	}
	public static int findMax(int[] arr) {
		if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
