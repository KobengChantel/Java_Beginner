package Book2.chapter7;

//Listing 7-2
// presents another version of the guessing-game program that uses four methods in
//addition to main:

//playARound: This method plays one round of the guessing game. It doesn’t
//return a value.

//» getRandomNumber: This method returns a random number between
//1 and 10

//getGuess: This method gets the user’s guess, makes sure that it is between
//1 and 10, and returns the guess if it’s within the acceptable range.

//» askForAnotherRound: This method asks the user to play another round
//and returns a boolean value to indicate whether the user wants to continue
//playing.

import java.util.Scanner;
public class GuessingGameMethod2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {
        boolean validInput;
        int number, guess;
        String answer;
// Pick a random number
        number = getRandomNumber();
// Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();
// Check the guess
        if (guess == number)
            System.out.println("You're right!");
        else
            System.out.println("You're wrong!"
                    + " The number was " + number);
    }

    public static int getRandomNumber()

    {
        return (int) (Math.random() * 10) + 1;
    }

    public static int getGuess()

    {
        while (true)
        {
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 and 10. "
                        + "Try again: ");
            } else
                return guess;
        }
    }

    public static boolean askForAnotherRound()

    {
        while (true)
        {
            String answer;
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
else if (answer.equalsIgnoreCase("N"))
            return false;
        }
    }
}