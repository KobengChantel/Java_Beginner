package Book2.chapter5;

//pro-gram implements a simple guessing game in which the computer picks a number
//between 1 and 10, and you have to guess the number. After you guess, the computer tells you whether you’re right or wrong and then asks whether you want to
//play again. If you enter Y or y, the game starts over.

//nesting comes into play because the entire game is written in a while loop
//that repeats as long as you say you want to play another game. Then — within
//that loop — each time the game asks for input from the user, it uses a do-while
//loop to validate the user’s entry. Thus, when the game asks the user to guess a
//number between 1 and 10, it keeps looping until the number entered by the user is
//in that range. And when the game asks the user whether he or she wants to play
//again, it loops until the user enters Y, y, N, or n




import java.util.Scanner;
public class GuessingGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean keepPlaying = true;
        System.out.println("Let's play a guessing game!");
        while (keepPlaying)
        {
            boolean validInput;
            int number, guess;
            String answer;
// Pick a random number

            number = (int)(Math.random() * 10) + 1;
// Get the guess
            System.out.println("\nI'm thinking of a number "
                    + "between 1 and 10.");
            System.out.print("What do you think it is? ");
            do
            {
                guess = sc.nextInt();
                validInput = true;
                if ( (guess < 1) || (guess > 10) )
                {
                    System.out.print
                            ("I said, between 1 and 10. "
                                    + "Try again: ");
                    validInput = false;
                }
            } while (!validInput);
// Check the guess
            if (guess == number)
            System.out.println("You're right!");
else
System.out.println("You're wrong! " +
                    "The number was " + number);
// Play again?
do
            {
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y"));
                else if (answer.equalsIgnoreCase("N"))
                    keepPlaying = false;
                else
                    validInput = false;
            } while (!validInput);
        }
        System.out.println("\nThank you for playing!");
    }
}



