package Book2.chapter3;
//LISTING3:4
//rolling The dice

public class DiceApp {
    public static void main(String[] args) {
        // Declare an integer variable to hold the result of each dice roll
        int roll;

        // Message to be displayed before the random rolls
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg); // Print the message to the console

        // Loop to generate and print 100 random dice rolls
        for (int i = 0; i < 100; i++) {
            // Call the randomInt method to get a random number between 1 and 6 (inclusive)
            roll = randomInt(1, 6);
            // Print the result of the roll followed by a space
            System.out.print(roll + " ");
        }
        System.out.println(); // Print a newline after all rolls are displayed
    }

    // Method to generate a random integer between low and high (inclusive)
    public static int randomInt(int low, int high) {
        // Calculate a random number in the specified range
        int result = (int)(Math.random() * (high - low + 1)) + low;
        return result; // Return the random number
    }
}



