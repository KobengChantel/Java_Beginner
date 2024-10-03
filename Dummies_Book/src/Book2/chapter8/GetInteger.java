package Book2.chapter8;

//Listing 8-1
//TRY BLOCK
//a program that uses a method to get a valid
//integer from the user. If the user enters a value that isn’t a valid integer, the catch
//block catches the error and forces the loop to repeat


import java.util.*;
public class GetInteger
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }
    public static int GetAnInteger()
    {
        while (true)
        {
            try
            {
                return sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                sc.next();
                System.out.print("That's not "
                        + "an integer. Try again: ");
            }
        }
    }
}

