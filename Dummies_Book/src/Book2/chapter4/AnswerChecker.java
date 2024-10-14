package Book2.chapter4;

//public class AnswerChecker {
//
//        public static void main(String[] args) {
//            // Sample answer value
//            String answer = "Yes"; // You can change this value to test different cases
//
//            // Compare the answer using equals() method
//            if (answer.equals("Yes")) {
//                System.out.println("The answer is Yes.");
//            } else {
//                System.out.println("The answer is not Yes.");
//            }
//        }
//    }


import java.util.Scanner;

public class AnswerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user for an answer
        System.out.print("Please enter your answer (Yes/No): ");
        String answer = scanner.nextLine(); // Read user input

        // Compare the answer using ==
        if (answer == "Yes") {
            System.out.println("The answer is Yes (using ==).");
        } else {
            System.out.println("The answer is not Yes (using ==).");
        }

        // Compare the answer using equals()
        if (answer.equals("Yes")) {
            System.out.println("The answer is Yes (using equals()).");
        } else {
            System.out.println("The answer is not Yes (using equals()).");
        }

        // Check if the input is "end" to exit the program
        System.out.print("Type 'end' to exit the program: ");
        String input = scanner.nextLine(); // Read user input

        if (input.equalsIgnoreCase("end")) {
            System.out.println("Ending the program.");
        } else {
            System.out.println("You typed: " + input + ". The program will continue.");
        }

        scanner.close(); // Close the scanner
    }
}
