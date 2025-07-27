package week2.day11;
import java.util.Scanner;

public class CountOccurances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers will be entered?");
		int num = input.nextInt();
		int [] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter number " + (i + 1) + ":");
			arr [i] = input.nextInt();
		}
		System.out.println("What is the number you want to count?");
		int target = input.nextInt();
		int result = countOccurences(arr, target);
		System.out.println("The number " + target + " occurs " + result + " times.");
		input.close();
		
	}
	public static int countOccurences(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count;
	}
}
