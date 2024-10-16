package Book4.chapter2;

public class ArraynestedArray {
    public static void main(String[] args) {
        // Initialize the first 3D array with specified values
        int[][][] threeD = {
                { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },
                { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
                { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
        };

        // Initialize the second 3D array and populate it with values from 1 to 27
        int[][][] threeD2 = new int[3][3][3];
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    threeD2[i][j][k] = value++;
                }
            }
        }

        // Print both 3D arrays
        System.out.println("Contents of threeD:");
        print3DArray(threeD);

        System.out.println("\nContents of threeD2:");
        print3DArray(threeD2);
    }

    // Method to print a 3D array
    private static void print3DArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println(); // New line after each row
            }
            System.out.println(); // New line after each layer
        }
    }
}
