package week1.day4;
import java.util.Scanner;

public class FindMinMaxAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("How many scores would you like to enter?");
        
        int size = input.nextInt();
        int[] scores = new int[size];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        System.out.println("Enter scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
 
            while (input.nextInt() > 0 && input.nextInt() < 100) {
            	
            scores[i] = input.nextInt();
            // Update max
            if (scores[i] > max) {
                max = scores[i];
            }
            // Update min
            if (scores[i] < min) {
                min = scores[i];
            }
            // Add to sum for average calculation later
            sum += scores[i];
            }
        }
        
        double average = (double) sum / size;
        
        System.out.println("The highest score is: " + max);
        System.out.println("The lowest score is: " + min);
        System.out.println("The average score is: " + average);
        
        input.close();
    }

}
