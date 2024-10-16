package Book4.chapter2;
//Sorting an Array
//sort method is a quick way to sort an array in sequence

import java.util.Arrays; // Import the Arrays class

public class SortArray {
    public static void main(String[] args) {
        int[] lotto = new int[6]; // Create an array of 6 integers
        for (int i = 0; i < 6; i++)
            lotto[i] = (int)(Math.random() * 100) + 1; // Assign random values between 1 and 100

        Arrays.sort(lotto); // Sort the array in ascending order

        // Print the sorted array
        System.out.println(Arrays.toString(lotto));
    }
}
