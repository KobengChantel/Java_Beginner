package Book3.chapter4;
//polymorphism refers to the ability of Java to use base class variables to
//refer to subclass objects; to keep track of which subclass an object belongs to; and
//to use overridden methods of the subclass
// Base Player class
public class Player {
    // Method to simulate a player's move
    public int move() {
        System.out.println("\nThe basic player says:");
        System.out.println("I'll take the first open square!");
        return firstOpenSquare();
    }

    // Method to find the first open square
    private int firstOpenSquare() {
        int square = 0; // Assuming square 0 is the first open square
        // Logic to find the first open square should be implemented here
        // For example, you might check an array or a board to see which square is available
        return square;
    }
}

