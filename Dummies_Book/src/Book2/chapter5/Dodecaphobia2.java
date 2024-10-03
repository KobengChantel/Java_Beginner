package Book2.chapter5;

//Obviously, infinite loops are something you want to avoid in your programs. So
//whenever you use a while expression that’s always true, be sure to throw in a
//break statement to give your loop some way to terminate. You could use an infi-
//nite loop with a break statement in the Dodecaphobia program
public class Dodecaphobia2 {

    public static void main(String[] args)
    {
        int number = 2;
        while (true)
        {
            if (number == 12)
                break;
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }

}
