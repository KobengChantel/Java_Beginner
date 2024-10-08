package Book3.chapter4;

// subclass declares a method that has the same signature as a public method of
//the base class, the subclass version of the method overrides the base class version
//of the method.

//technique lets you modify the behavior of a base class to suit
//the needs of the subclass
//

//implementing the override method
public class Game {
    public void play() {
        // Default play behavior (can be left empty or have a message)
    }

    //eclare a class named Chess that extends the Game class but also pro-
    //vides an implementation for the play method
    public class Chess extends Game {
        @Override
        public void play() {
            System.out.println("I give up. You win.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Game
        Game game = new Game();

        // Create an instance of the inner class Chess
        Game.Chess chess = game.new Chess();

        // Call the play method on the Chess instance
        chess.play();
    }
}

