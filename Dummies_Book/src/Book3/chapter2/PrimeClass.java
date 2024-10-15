package Book3.chapter2;

//Initializer blocks are similar to variable initializers used to initialize variables
//initializer (sometimes called an initializer block) is a lonely block of code that’s
//placed outside any method, constructor, or other block of code
//Initializers are
//executed whenever an instance of a class is created, regardless of which construc-
//tor is used to create the instance

import java.util.Scanner;

class PrimeClass {
    private int x;

    // Constructor prompts the user to enter a starting value for x
    public PrimeClass() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value for x: ");
        x = sc.nextInt();
        sc.close(); // Close the Scanner
    }

    // Getter method for x
    public int getXValue() {
        return x;
    }
}

