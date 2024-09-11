//
//Exercise 7-1
//
//        1. Use the indexOf method to get the index for the space character (" ")
//within custName.  Assign it to spaceIdx.
//        2. Use the substring method and the spaceIdx to get the first name
//portion of custName.  Assign it to firstName.  Print firstName.

package Chapter7.ex07_1_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Chantel Kobeng";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");
        System.out.println("The idex of the space is " + spaceIdx);

        // Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println("The firstName is " + firstName);
    }
}
