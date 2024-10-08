package Book3.chapter4;
////polymorphism refers to the ability of Java to use base class variables to
////refer to subclass objects; to keep track of which subclass an object belongs to; and
////to use overridden methods of the subclass
//// Base Player class


//BetterPlayer class extending Player
class BetterPlayer extends Player {
    // Overriding move method for better strategy
    @Override
    public int move() {
        System.out.println("\nThe better player says:");
        System.out.println("I'm looking for a good move...");
        return findBestMove();
    }

    // Method to find the best move
    private int findBestMove() {
        int square = 0; // Placeholder for the best move
        // Logic to determine the best move should be implemented here
        // This could involve checking all possible moves and selecting the best one
        return square;
    }
            }

