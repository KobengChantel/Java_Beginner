package Book2.chapter7;

//Scoping out parameters

//cope of a parameter is the method for which the parameter is declared. As a
//result, a parameter can have the same name as local variables used in other methods without causing any conflict
public class ParameterScope {

    public static void main(String[] args)
    {
        int min = 1;
        int max = 10;
        int number = getRandomNumber(min, max);

        System.out.println(number);
    }
    public static int getRandomNumber(int min, int max)
    {
        return (int)(Math.random()
                * (max - min + 1)) + min;
    }
}
