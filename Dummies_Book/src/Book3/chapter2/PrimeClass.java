package Book3.chapter2;

//Initializer blocks are similar to variable initializers used to initialize variables
//initializer (sometimes called an initializer block) is a lonely block of code that’s
//placed outside any method, constructor, or other block of code
//Initializers are
//executed whenever an instance of a class is created, regardless of which construc-
//tor is used to create the instance

import java.util.Scanner;

// class PrimeClass {
//
//
//     private Scanner sc = new Scanner(System.in);
//     public int x;
//
//     {
//         System.out.print(
//                 "Enter the starting value for x: ");
//         x = sc.nextInt();
//     }
// }


class PrimeClass
{
    private Scanner sc = new Scanner(System.in);
    public int x = getX();
    private int getX()
    {
        System.out.print("Enter the starting value "
                + "for x: ");
        return sc.nextInt();
    }
}