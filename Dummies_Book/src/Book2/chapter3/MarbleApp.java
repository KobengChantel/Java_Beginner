package Book2.chapter3;

//A Program That Divvies Up Marbles
//LISTING3:1

import java.util.Scanner;

public class MarbleApp {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
// declarations →9
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;
// get the input data →15
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();
// calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;
// print the results →26
        System.out.println("Give each child " +
                marblesPerChild + " marbles.");
        System.out.println("You will have " +
                marblesLeftOver + " marbles left over.");
    }

}