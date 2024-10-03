package Book2.chapter7;

//Understanding pass-by-value

//Java passes a variable to a method via a parameter, the method itself receives
//a copy of the variable’s value, not the variable itself.
// This copy is called a pass-by-value, and it has an important consequence:
// If a method changes the value it
//receives as a parameter, that change is not reflected in the original variable that
//was passed to the method

public class ChangeParameters
{
    public static void main(String[] args)
    {
        int number = 1;
        tryToChangeNumber(number);
        System.out.println(number);
    }
    public static void tryToChangeNumber(int i)
    {
        i = 2;
    }

}
