


//1. Instantiate the StringBuilder object (sb), initializing it
//        to firstName, using the StringBuilder constructor.
//2. Use the append method of the StringBuilder object to append the
//last name back onto the first name.  You can just use a String
//literal for the last name.
//Print the StringBuilder object and test your code.
//It should show the full name.
//public String substring(int startIndex, int endIndex)
//Challenge:  Can you append the last name without using a String literal?

package Chapter6.ex06_2_exercise;

public class ShoppingCart {

    public static void main(String args[]) {
        String custName = "Chantel Kobeng";
        String firstName;
        int spaceIdx;
        StringBuilder sb;

        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

        //Instantiate and initialize sb to firstName.
sb = new StringBuilder(firstName);
        // Put the full name back together, using StringBuilder append method.
        String lastName = custName.substring(spaceIdx,custName.length());
        //   You can just enter the String literal for the last name.
        sb.append(" MmaMogaShwa");
        //   Print the full name.
        System.out.println(sb.toString());

    }

}
