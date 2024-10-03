package Book2.chapter6;
//Listing 6-3

//Application that displays all the products you get when you order a specific package.
// It works by testing the package codes in a switch statement in reverse order (starting with package E)
// and adding the products that come with each package to the details variable.
// None of the case groups except the last includes a break statement.
// As a result, control falls through each case group to the next group.
// Thus, once a case group has tested true, the rest of the
//        case groups in the switch statement are executed.

//Package Services
//        A   Wash, vacuum, and hand-dry
//        B   Package A + wax
//        C   Package B + leather/vinyl treatment
//        D   Package C + tire treatment
//        E   Package D + new-car scent


import java.util.Scanner;
public class CarWashApp {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println
                ("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);
        String details = "";

        switch (p)
        {
            case 'E':
            case 'e':
                details += "\tNew Car Scent, plus ... \n";
            case 'D':
            case 'd':
                details += "\tTire Treatment, plus ... \n";
            case 'C':
            case 'c':
                details +=
                        "\tLeather/Vinyl Treatment, plus ... \n";
            case 'B':
            case 'b':
                details += "\tWax, plus ... \n";
            case 'A':
            case 'a':
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
