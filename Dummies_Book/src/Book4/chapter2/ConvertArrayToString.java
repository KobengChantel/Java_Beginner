package Book4.chapter2;
// toString method of the Arrays class is handy if you want to quickly dump the
//contents of an array to the console to see what it contains

//s method returns
//a string that shows the array’s elements enclosed in brackets, with the elements
//separated by commas

public class ConvertArrayToString {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++)
            lotto[i] = (int)(Math.random() * 100) + 1;
        System.out.println(Arrays.toString(lotto));
    }
}
