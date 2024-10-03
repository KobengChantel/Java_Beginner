package Book2.chapter7;

//Using the return statement
// return type other than void in a method declaration, the body
//of the method must include a return statement that specifies the value to be
//returned

// program that uses a method that determines a random number between
//1 and 10

public class RandomNumber {

    public static void main(String[] args)
    {
        //assign a value
        int number = getRandomNumber();
        System.out.println("The number is " + number);
    }
    public static int getRandomNumber()
    {
        // method to
        //calculate a random number from 1 to 10
        int num = (int)(Math.random() * 10) + 1;
        return num;
    }
}



