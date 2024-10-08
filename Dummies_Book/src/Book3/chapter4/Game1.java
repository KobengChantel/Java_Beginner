package Book3.chapter4;
////polymorphism refers to the ability of Java to use base class variables to
////refer to subclass objects; to keep track of which subclass an object belongs to; and
////to use overridden methods of the subclass
//// Base Player class
public class Game1 {
    // Main class to run the game simulation

    public static void main(String[] args) {
        Player basicPlayer = new Player(); // Create a basic player
        int basicMove = basicPlayer.move(); // Basic player's move
        System.out.println("Basic player moves to square: " + basicMove);

        BetterPlayer betterPlayer = new BetterPlayer(); // Create a better player
        int betterMove = betterPlayer.move(); // Better player's move
        System.out.println("Better player moves to square: " + betterMove);
    }
}

