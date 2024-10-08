package Book2.chapter8;

//Listing 8-2
//he GetInteger method that
//uses a while loop to avoid the exception

import java.util.*;
public class GetInteger2 {


        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args)
        {
            System.out.print("Enter an integer: ");
            int i = GetAnInteger();
            System.out.println("You entered " + i);
        }
        public static int GetAnInteger()
        {
            while (!sc.hasNextInt())
            {
                sc.nextLine();
                System.out.print("That's not "
                        + "an integer. Try again: ");
            }
            return sc.nextInt();
        }
    }

