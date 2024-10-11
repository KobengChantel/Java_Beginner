package Book4.chapter2;
//equality operator (==) to compare array variables, the array vari-
//ables are considered to be equal only if both variables point to exactly the same
//array instance

//compare two arrays element by element, you should use the
//Arrays.equal method instead


public class CompareArray {
    public static void main(String[] args) {
        if (Arrays.equal(array1, array2))
            System.out.println("The arrays are equal!")
    }
}
