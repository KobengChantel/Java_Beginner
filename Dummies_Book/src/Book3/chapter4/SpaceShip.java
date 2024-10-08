package Book3.chapter4;
// final keyword that serves three purposes.
//use final with a
//variable, it creates a constant whose value can’t be changed after it has been initialized
// two uses of the final keyword are to
//create final methods and final classes
//inal method is a method that can’t be overridden by a subclass
//final class is a class that can’t be used as a base class. To declare a class as final,
//just add the final keyword
public class SpaceShip {
    // Field to hold the velocity of the spaceship
    private int velocity;

    // Constructor to initialize the spaceship's velocity
    public SpaceShip(int velocity) {
        this.velocity = velocity;
    }

    // we are declaring final classGetter method to retrieve the spaceship's velocity
    public final int getVelocity() {
        return this.velocity; // Return the current velocity
    }

    // Main method for testing
    public static void main(String[] args) {
        SpaceShip spaceship = new SpaceShip(100); // Create a spaceship with velocity 100
        System.out.println("Spaceship velocity: " + spaceship.getVelocity()); // Print the velocity
    }
}

