package Book2.chapter3;
//The Circle Area Calculator
//LISTING3:2

import java.util.Scanner;
import java.util.Scanner; // Import the Scanner class for user input

public class CircleAreaApp {

    // Create a static Scanner object for reading input from the console
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Print a welcome message to the user
        System.out.println("Welcome to the circle area calculator.");

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of your circle: ");

        // Read the radius value entered by the user
        double r = sc.nextDouble();

        // Calculate the area of the circle using the formula: area = π * r^2
        double area = Math.PI * (r * r);

        // Print the calculated area to the console
        System.out.println("The area is " + area);
    }
}

