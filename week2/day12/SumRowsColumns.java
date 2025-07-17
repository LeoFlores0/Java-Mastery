package week2day12;
import java.util.Scanner;

public class SumRowsColumns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of rows:");
		int rows = input.nextInt();
		System.out.println("Enter total number of columns:");
		int columns = input.nextInt();
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter element at row " + (i + 1) + ", column " + (j + 1) + ":");
				arr[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < columns; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + ": " + sum);
		}
		System.out.println();
		for (int j = 0; j < columns; j++) {
			int sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of column " + (j + 1) + ": " + sum);
		}
		input.close();
	}

}
