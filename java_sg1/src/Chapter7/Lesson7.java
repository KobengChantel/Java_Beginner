package Chapter7;

public class Lesson7 {
    public static void main(String[] args) {
        String hisName = "Fred Smith";
        String herName = new String("Anne Smith");

//        STRING CONCATENATION
        System.out.println("\n---String Concatenation---");
        String myString = "Hello";
        System.out.println(myString);
        myString = myString.concat(" World");
        System.out.println(myString);
        myString = myString + "!";
        System.out.println(myString);

//        STRING METHODS
        System.out.println("\n---String Methods---");
        String hello = "Hello World!";
        int strLength = hello.length();
        System.out.println(strLength);

        String greet = "HOW ".trim();
        String lc = (greet + "DY").toLowerCase();
        System.out.println(lc);

        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf("-");
        System.out.println("Index of first dash: " + idx1);

        int idx2 = phoneNum.indexOf("-", idx1 + 1);
        System.out.println("Index of second dash: " + idx2);

//        STRING BUILDERS
        System.out.println("\n---StringBuilder Class---");
        StringBuilder mySB = new StringBuilder("Hello");
        mySB.append(" World");

        System.out.println(mySB);

//        PRIMITIVE DATA TYPES
        System.out.println("\n---Primitive Data Types---");
        int count = 15;
        int a, b, c, d;
        //postincrement
        a = count++;
        b = count;
        //preincrement
        c = ++count;
        d = count;
//
//        System.out.println(a + ", " + b + ", " + c + ", " + d);
//        short a, b, c;
//        a = 1;
//        b = 2;
//        c = (short) (a + b);
    }
}
