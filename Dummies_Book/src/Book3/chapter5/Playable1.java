package Book3.chapter5;

public class TicTacToe implements PlayAble {
    private char[][] board;
    private char currentPlayer;

    // Constructor
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
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
        while (!isGameWon) {
            printBoard();
            // Code for getting user input and updating the board goes here
            // Check if the current player has won
            isGameWon = checkWin();
            if (!isGameWon) {
                switchPlayer();
            }
        }
        System.out.println("Player " + currentPlayer + " wins!");
    }

    // Method to switch players
    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check if the current player has won the game
    private boolean checkWin() {
        // Logic for checking the win condition goes here
        return false; // Replace with actual condition
    }

    // Additional methods for gameplay can go here
}
