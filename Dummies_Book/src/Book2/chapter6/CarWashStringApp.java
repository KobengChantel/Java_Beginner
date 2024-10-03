package Book2.chapter6;

//Listing 6-5

//ar wash program that uses the
//string codes PRESIDENTIAL, ELITE, DELUXE, SUPER, and STANDARD as the car wash
//types, instead of the letters A through E. Notice that to allow for variations in how
//a user might capitalize these codes, the user’s input is converted to all capital
//letters before it is tested against the string constants in the switch statement

//PRESIDENTIAL
//STANDARD
//SUPER
//ELITE
//DELUXE

import java.util.Scanner;
public class CarWashStringApp
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("The car wash application\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        String details = "";

        switch (s.toUpperCase())
        {
            case "PRESIDENTIAL":
                details += "\tNew Car Scent, plus ... \n";
            case "ELITE":
                details += "\tTire Treatment, plus ... \n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus ... \n";
            case "SUPER":
                details += "\tWax, plus ... \n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
