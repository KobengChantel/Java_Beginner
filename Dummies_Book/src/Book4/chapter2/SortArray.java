package Book4.chapter2;
//Sorting an Array
//sort method is a quick way to sort an array in sequence

public class SortArray {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++)
            lotto[i] = (int)(Math.random() * 100) + 1;
        Arrays.sort(lotto);
    }
}
