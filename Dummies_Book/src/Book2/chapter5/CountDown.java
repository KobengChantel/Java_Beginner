package Book2.chapter5;

//o count backward, you simply
//have to adjust the three for loop expressions. As usual, the initialization expres-
//sion specifies the starting value for the counter variable. The test expression uses
//a greater-than test instead of a less-than test, and the count expression subtracts
//from the counter variable rather than adding to it

public class CountDown {
    public static void main(String[] args)
    {
        for (int count = 10; count >= 1; count--)
        {
            System.out.println(count);
        }
    }

}
