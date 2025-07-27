package week2.day11;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers will be entered?");
		int num = input.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter number " + (i + 1) + ":");
			arr[i] = input.nextInt();
		}
		int[] result = reverseArray(arr);
		System.out.print("Reversed array is: ");
		for (int i = 0; i < result.length; i++) {
		    System.out.print(result[i] + " ");
		}
		System.out.println();
		input.close();
	}
	public static int[] reverseArray(int[] arr) {
		int[] reversed = new int[arr.length];
		for (int i = 0; i < arr.length; i ++) {
			reversed[i] = arr[arr.length - 1 - i];
			}
		return reversed;
		}
}
