package Book3.chapter5;

import java.util.Scanner;

public class TicTacToe implements PlayAble {
    private char[][] board;
    private char currentPlayer;
    private Scanner scanner;

    // Constructor
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
        initializeBoard();
    }

    // Initializes the game board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Display the board
    private void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // The main play method where game logic goes
    public void play() {
        boolean isGameWon = false;
        int moves = 0; // To track the number of moves made

        while (!isGameWon && moves < 9) { // Maximum 9 moves in a Tic Tac Toe game
            printBoard();
            getUserInput();
            isGameWon = checkWin();
            moves++;

            if (!isGameWon) {
                switchPlayer();
            }
        }

        printBoard(); // Show the final board
        if (isGameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    // Method to switch players
    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Get user input for placing a mark on the board
    private void getUserInput() {
        int row, col;
        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            // Validate input
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }
    }

    // Check if the current player has won the game
    private boolean checkWin() {
        // Check rows, columns and diagonals for a win
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            // Check columns
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false; // No win found
    }

    // Close the scanner when the game ends
    public void closeScanner() {
        scanner.close();
    }
}
