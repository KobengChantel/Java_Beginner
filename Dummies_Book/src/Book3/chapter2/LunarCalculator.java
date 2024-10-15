package Book3.chapter2;

// LunarCalculator class definition
public class LunarCalculator {

    // Private fields
    private int x_position = 0;
    private int y_position = 0;
    private String errorMessage = "";

    // Constructor
    public LunarCalculator() {
        // Initialize values if needed
    }

    // Private method to calculate lunar trajectory
    private void calculateLunarTrajectory() {
        // Simulating a calculation (for demonstration purposes)
        x_position = 100; // Example value
        y_position = 200; // Example value

        // Example of setting an error message
        if (x_position < 0 || y_position < 0) {
            errorMessage = "Invalid position values";
        }
    }

    // Method to initiate calculation (public method that can be called)
    public void initiateCalculation() {
        calculateLunarTrajectory(); // Call the private method
    }

    // Public method to clear error message
    public void clearErrorMessage() {
        errorMessage = "";
    }

    // Example public method to get the current position
    public int getXPosition() {
        return x_position;
    }

    public int getYPosition() {
        return y_position;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    // New print method to display the current state
    public void print() {
        System.out.println("X Position: " + x_position);
        System.out.println("Y Position: " + y_position);
        if (!errorMessage.isEmpty()) {
            System.out.println("Error Message: " + errorMessage);
        } else {
            System.out.println("No errors.");
        }
    }
}

// Separate Main class for testing
class Main {
    public static void main(String[] args) {
        LunarCalculator calculator = new LunarCalculator();
        calculator.initiateCalculation();
        calculator.print(); // Outputs the current state of the object
    }
}
