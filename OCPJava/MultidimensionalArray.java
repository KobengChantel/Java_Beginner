public class MultidimensionalArray {

    public static void main(String[] args) {
        int[][] twoD = new int[3][2]; // Declare and initialize a 2D array

        // Populate and print the 2D array
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " "); // Print element
            }
            System.out.println(); // Time for a new row
        }
    }
}
