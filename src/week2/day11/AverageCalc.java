package week2.day11;
import java.util.Scanner;

public class AverageCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers will be entered?");
		int num = input.nextInt();
		double [] arr = new double[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter number " + (i+1) + ":");
			arr [i] = input.nextDouble();
		}
		System.out.println(calculateAverage(arr));
		input.close();
	}
		public static double calculateAverage(double [] arr) {
			double average = 0;
			for (int i = 0; i < arr.length; i++) {
				average += arr[i];
			}
			return average / arr.length;
	}
}
