package Book4.chapter2;
// toString method of the Arrays class is handy if you want to quickly dump the
//contents of an array to the console to see what it contains

//s method returns
//a string that shows the array’s elements enclosed in brackets, with the elements
//separated by commas

import java.util.Arrays; // Import the Arrays class

public class ConvertArrayToString {
    public static void main(String[] args) {
        int[] lotto = new int[6]; // Create an array of 6 integers
        for (int i = 0; i < 6; i++)
            lotto[i] = (int)(Math.random() * 100) + 1; // Assign random values between 1 and 100

        // Print the array as a string
        System.out.println(Arrays.toString(lotto));
    }
}
