package week1.day5;
import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many scores would you like to enter?");
		
		int size = input.nextInt();
		int[] scores = new int[size];
		int max = Integer.MIN_VALUE;
		
		System.out.println("Enter scores:");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("Score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("The highest score is: " + max);
		input.close();
	}

}
