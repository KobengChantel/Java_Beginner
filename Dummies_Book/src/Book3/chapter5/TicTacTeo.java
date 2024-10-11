package Book3.chapter5;

public class TicTacTeo implements PlayAble {
    private char[][] board;
    private char currentPlayer;

    // Constructor
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

}
