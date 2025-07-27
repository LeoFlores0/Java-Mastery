package week2day12;

public class TicTacToeBoard {

    public static void main(String[] args) {
        // Create a 3x3 char board
        char[][] board = new char[3][3];

        // Initialize each cell with a space character
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // Print the board in Tic-Tac-Toe format
        for (int i = 0; i < 3; i++) {
            // Print the row with | separators
            System.out.print(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
            System.out.println();
            
            // Print the separator line after rows 0 and 1 only
            if (i < 2) {
                System.out.println("-+-+-");
            }
        }
    }
}