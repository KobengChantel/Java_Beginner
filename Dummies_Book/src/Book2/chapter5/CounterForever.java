package Book2.chapter5;
// loop that goes on for-
//ever. You can create infinite loops many ways in Java (not all of them intentional),
//but the easiest is to just specify true for the while expressio
public class CounterForever {

    public static void main(String[] args)
    {
        int number = 2;
        while (true)
        {
            System.out.print(number + " ");
            number += 2;
        }
    }

}
