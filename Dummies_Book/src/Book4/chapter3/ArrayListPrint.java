package Book4.chapter3;
// PRINTING AN ARRAYLIST
//toString method of the ArrayList class (as well as other collection classes)
//is designed to make it easy to quickly print out the contents of the list. It returns
//the contents of the array list enclosed in a set of brackets, with each element value
//separated by commas. The toString method of each element is called to obtain
//the element value


import java.util.ArrayList; // Import the ArrayList class

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>(); // Create an ArrayList of Strings
        nums.add("One");  // Add elements to the ArrayList
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        System.out.println(nums); // Print the contents of the ArrayList
    }
}

