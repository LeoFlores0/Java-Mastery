package week2.day13;

public class WarmUp {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize board with spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // Print board cleanly
        for (int i = 0; i < 3; i++) {
            System.out.print(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
            System.out.println();
            if (i < 2) {
                System.out.println("-+-+-");
            }
        }
    }
}
