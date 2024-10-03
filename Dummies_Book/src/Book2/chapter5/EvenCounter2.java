package Book2.chapter5;
//do-while loop similar to while loop
// do-while loop, the condition that stops the loop
//isn’t tested until after the statements in the loop have executed.
//a do-while loop always get executed at least
//once
public class EvenCounter2 {

    public static void main(String[] args) {
        int number = 2;
        do {
            System.out.print(number + " ");
            number += 2;
        } while (number <= 20);
        System.out.println();
    }
    }
