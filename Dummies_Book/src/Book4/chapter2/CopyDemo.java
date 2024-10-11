package Book4.chapter2;
//LISTING 2.3
//COPYING AN ARRAY
//the Arrays class has some useful new methods. Using the new copyOf
//and copyOfRange methods, you can copy a bunch of elements from an existing
//array into a brand-new array. If you start with something named arrayOrigi-
//nal, for example, you can copy the arrayOriginal elements to something named
//        arrayNew
import java.util.Arrays;
class CopyDemo
{
    public static void main(String args[])
    {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[] =
                Arrays.copyOf(arrayOriginal, 3); →9
        printIntArray(arrayNew);
    }
    static void printIntArray(int arrayNew[])
    {
        for (int i : arrayNew)
        {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}
