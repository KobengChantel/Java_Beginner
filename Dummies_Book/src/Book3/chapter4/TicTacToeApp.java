package Book3.chapter4;
//ext thing to do is write a short class that uses these two Player classes to
//play a game. This class contains a method named playTheGame that accepts two
//Player objects. It calls the move method of the first player and then calls the move
//method of the second player
//playTheGame method doesn’t know which of the two players is the
//basic player and which is the better player. It simply calls the move method for
//each Player object
public class TicTacToeApp {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new BetterPlayer();
        playTheGame(p1, p2);
    }

    public static void playTheGame(Player p1, Player p2) {
        p1.move();
        p2.move();
    }
}
