package Book2.chapter5;

// GAnging up your expression
//obscure aspect of for loops is the fact that the initialization and count expres-
//sions can actually be a list of expressions separated by commas. This can be use-
//ful if you need to keep track of two counter variables at the same time

public class CountBothWays {
    public static void main(String[] args)
    {
        int a, b;
        for (a = 1, b = 10; a <= 10; a++, b--)
            System.out.println(a + " " + b);
    }

}
