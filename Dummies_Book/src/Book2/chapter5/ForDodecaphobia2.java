package Book2.chapter5;

//uses a continue statement to skip 12 rather than abort
//the loop

public class ForDodecaphobia2 {
    public static void main(String[] args)
    {
        for (int number = 2; number <=20; number += 2)
        {
            if (number == 12)
                continue;
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
