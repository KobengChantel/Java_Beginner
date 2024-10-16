package Book4.chapter2;
// binarySearch method is an efficient way to locate an item in an array by its
//value
import java.util.Arrays; // Importing the Arrays class for binary search

public class SearchArray {
    public static void main(String[] args) {
        // Initialize the lotto array with example numbers
        int[] lotto = {5, 7, 13, 21, 34, 55}; // Example array, ensure it's sorted for binary search
        int lucky = 13; // Corrected declaration
        int foundAt = -1;

        // Linear search
        for (int i = 0; i < lotto.length; i++) {
            if (lotto[i] == lucky) {
                foundAt = i; // Store the index if found
                break; // Exit the loop early
            }
        }

        // Check if found in linear search
        if (foundAt > -1) {
            System.out.println("My number came up (linear search) at index: " + foundAt);
        } else {
            System.out.println("I'm not lucky today (linear search).");
        }

        // Binary search (only works if the array is sorted)
        foundAt = Arrays.binarySearch(lotto, lucky);

        // Check if found in binary search
        if (foundAt > -1) {
            System.out.println("My number came up (binary search) at index: " + foundAt);
        } else {
            System.out.println("I'm not lucky today (binary search).");
        }
    }
}

