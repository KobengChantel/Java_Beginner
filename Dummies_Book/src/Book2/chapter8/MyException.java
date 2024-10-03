package Book2.chapter8;

//exception-class can be Exception or a class that’s derived from Exception.
//You find out how to create your own classes

public class MyException {
    public static void main(String[] args)
    {
        try
        {
            doSomething(true);
        }
        catch (Exception e)
        {
            System.out.println("Exception!");
        }
    }
    public static void doSomething(boolean t)
            throws Exception
    {
        if (t)
            throw new Exception();
    }
}
