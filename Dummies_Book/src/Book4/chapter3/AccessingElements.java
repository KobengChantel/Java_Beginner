package Book4.chapter3;
// ACCESSING ELEMENTS
// access a specific element in an array list, you can use the get method, which
//specifies the index value of the element you want to retrieve

//easiest way to access all the elements in an array list is to use an enhanced for
//statement, which lets you retrieve the elements without bothering with indexes or
//the get method//

import java.util.ArrayList;
import java.util.List;

public class AccessingElements {
    public static void main(String[] args) {
        // Declare and initialize the list
        List<String> nums = new ArrayList<>();

        // Adding sample elements to the list
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add("Five");

        // Using a traditional for loop
        System.out.println("Using a for loop:");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // Using a for-each loop (enhanced for loop)
        System.out.println("\nUsing a for-each loop:");
        for (String s : nums) {
            System.out.println(s);
        }

        // Accessing elements with their indices
        System.out.println("\nUsing index access:");
        for (String s : nums) {
            int i = nums.indexOf(s);
            System.out.println("Item " + i + ": " + s);
        }
    }
}
