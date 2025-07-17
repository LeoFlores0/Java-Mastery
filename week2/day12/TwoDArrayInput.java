package week2day12;
import java.util.Scanner;

public class TwoDArrayInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = input.nextInt();
		System.out.println("Enter number of columns:");
		int columns = input.nextInt();
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("enter element at row " + (i + 1) + ", column " + (j + 1) + ":");
				arr[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
