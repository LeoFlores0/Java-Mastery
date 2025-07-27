package week2.day13;
import java.util.Scanner;

public class PlayerMove {

	public static void updateBoard(char[][] board) {
		
		//Prints current state of the board
		
		for (int i = 0; i < 3; i++) {
			System.out.print(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
			System.out.println();
			if (i < 2) {
				System.out.println("-+-+-");
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] board = new char[3][3];
		int row, column;
		
		//Initialize board with empty spaces
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
		
		updateBoard(board);			
		
		//Check for valid input to then place X on board
		
		while (true) {
			System.out.println("Enter row number 1-3: ");
			row = input.nextInt() - 1;
			System.out.println("Enter column number 1-3: ");
			column = input.nextInt() - 1;
			
			if (row >= 0 && row < 3 && column >= 0 && column < 3) {
				if (board[row][column] == ' ') {
					break;
				} else {
					System.out.println("Cell already occupied. Try again.");
				}
			} else {
				System.out.println("Invalid input. Please enter a number between 1 and 3.");
			}
		}
		
		board[row][column] = 'X';
		updateBoard(board);	
		input.close();
	}
}
