package Book2.chapter8;

//A simple example o illustrate how to provide for an exception, here’s a program that divides two
//numbers and uses a try/catch statement to catch an exception if the second
//number turns out to be zero:

//Division occurs within a try block, and a catch block handles
//ArithmeticException. ArithmethicException is defined by java.lang, so an
//import statement for it isn’t necessary

public class DivideByZero {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0; // you know this won't work
        try

        {
            int c = a / b; // but you try it anyway
        }
        catch (ArithmeticException e)
        {
            System.out.println("Oops, you can't "
                    + "divide by zero.");
        }
    }
}