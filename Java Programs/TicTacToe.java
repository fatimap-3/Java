package assignment8;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        int moves = 0;
        char player = 'X';
        boolean gameover = false;

        // Initialize the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Play the game
        while (!gameover) {
            // Print the board
            printBoard(board);

            // Get the player's move
            System.out.print("Player " + player + ", enter row (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.print("Player " + player + ", enter column (1-3): ");
            int col = scanner.nextInt() - 1;

            // Check if the move is valid
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid move, try again.");
            } else if (board[row][col] != '-') {
                System.out.println("Cell is already taken, try again.");
            } else {
                // Make the move
                board[row][col] = player;
                moves++;

                // Check if the game is over
                if (checkWin(board, player)) {
                    printBoard(board);
                    System.out.println("Player " + player + " wins!");
                    gameover = true;
                } else if (moves == 9) {
                    printBoard(board);
                    System.out.println("Draw!");
                    gameover = true;
                } else {
                    // Switch players
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    // Prints the tic-tac-toe board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Checks if a player has won
    public static boolean checkWin(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}


