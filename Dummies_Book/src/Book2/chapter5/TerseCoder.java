package Book2.chapter5;

//using for loop without bodies

//terse-coders sometimes like to play with for statements in an effort to
//do away with the body of a for loop altogethe

// To do that we take advantage of
//the fact that you can code any expression you want in the count expression part of
//a for statement, including method call

// printing numbers from 1-10
public class TerseCoder {

    public static void main(String[] args)
    {
        for (int i = 1; i <=10; System.out.println(i++));
    }
}
