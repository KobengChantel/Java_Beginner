package Book2.chapter5;
//use a break in a for loop just as you can in a while or do-while loop
public class ForDodecaphobia {
    public static void main(String[] args)
    {
        for (int number = 2; number <=20; number += 2)
        {
            if (number == 12)
                break;
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
