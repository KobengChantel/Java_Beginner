package Book4.chapter3;
//  creating an arraylist object
//create an array list, you first declare an ArrayList variable and then call the
//ArrayList constructor to instantiate an ArrayList object and assign it to the
//variable.

import java.util.ArrayList; // Import the ArrayList class

public class CreateArrayListObject {
    public static void main(String[] args) {
        // Using generics for type safety
        ArrayList<String> signs = new ArrayList<>(); // Create an ArrayList to hold String objects

        // Adding elements to the ArrayList
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
        signs.add("7-Up: You Like It, It Likes You");
        signs.add("Dr. Pepper 10, 2, 4");

        // Print the contents of the ArrayList
        System.out.println(signs);
    }
}

