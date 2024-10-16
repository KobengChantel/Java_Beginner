package Book4.chapter3;
//ADDING ELEMENTS
//you create an array list, you can use the add method to add objects to the
//array list
import java.util.ArrayList;

public class AddingElements {
    public static void main(String[] args) {
        // Create an ArrayList to hold sign messages
        ArrayList<String> signs = new ArrayList<>();
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
        signs.add("7-Up: You Like It, It Likes You");
        signs.add("Dr. Pepper 10, 2, 4");

        // Print all signs
        System.out.println("Signs:");
        for (String sign : signs) {
            System.out.println(sign);
        }

        // Create an ArrayList to hold numbers
        ArrayList<String> nums = new ArrayList<>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");

        // Insert an object at a specific position
        nums.add(2, "Two and a half");

        // Print all numbers
        System.out.println("\nNumbers:");
        for (String num : nums) {
            System.out.println(num);
        }
    }
}
