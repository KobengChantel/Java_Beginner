package Book4.chapter2;
//equality operator (==) to compare array variables, the array vari-
//ables are considered to be equal only if both variables point to exactly the same
//array instance

//compare two arrays element by element, you should use the
//Arrays.equal method instead


import java.util.Arrays; // Import the Arrays class

public class CompareArray {
    public static void main(String[] args) {
        // Initialize two arrays for comparison
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Use Arrays.equals to compare the arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("The arrays are equal!"); // Fixed syntax
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
