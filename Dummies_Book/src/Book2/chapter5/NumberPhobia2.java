package Book2.chapter5;

//using while condition
import java.util.Scanner;
public class NumberPhobia2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int number = 2;
        String input = "Y";
        while (input.equalsIgnoreCase("Y"))
        {
            System.out.println(number + " ");
            System.out.print
                    ("Do you want to keep counting?"
                            + " (Y or N)");
            input = sc.next();
            number += 2;
        }
        System.out.println("\nWhew! That was close.");
    }

}
