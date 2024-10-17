package Book4.chapter4;



// Class to test the functionality of the GenStack generic stack implementation
public class GenStackTest {
    // Constructor for GenStackTest
    public GenStackTest() {
    }

    // Main method to execute the test cases for GenStack
    public static void main(String[] args) {
        // Create a new generic stack for Strings
        GenStack<String> gs = new GenStack<>();

        // Pushing items onto the stack
        System.out.println("Pushing four items onto the stack.");
        gs.push("One");   // Push first item
        gs.push("Two");   // Push second item
        gs.push("Three"); // Push third item
        gs.push("Four");  // Push fourth item

        // Print the number of items in the stack
        System.out.println("There are " + gs.size() + " items in the stack.\n");

        // Peek at the top item in the stack without removing it
        System.out.println("The top item is: " + (String)gs.peek() + "\n");

        // Confirm the number of items remains the same after peeking
        System.out.println("There are still " + gs.size() + " items in the stack.\n");

        // Popping all items from the stack and printing them
        System.out.println("Popping everything:");
        while (gs.hasItems()) {
            // Pop each item from the stack and print it
            System.out.println((String)gs.pop());
        }

        // Print the number of items remaining in the stack (should be zero)
        System.out.println("There are now " + gs.size() + " items in the stack.\n");

        // Attempt to peek at the top item of an empty stack
        // Note: This may throw an exception if peek() is not handled for empty stacks
        System.out.println("The top item is: " + (String)gs.peek() + "\n");
    }
}
