package week2.day11;
import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers will be entered?");
		int num = input.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter number " +  (i + 1) + ":");
			arr[i] = input.nextInt();
		}
		boolean result = isSorted(arr);
		System.out.println(result);
		input.close();
	}
	public static Boolean isSorted(int[] arr) {
		 if (arr.length <= 1) {
	            return true;
	        }
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
