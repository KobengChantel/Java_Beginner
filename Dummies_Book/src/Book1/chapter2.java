package Book1;

//CHAPTER 2 Installing and Using Java Tools 21
//Installing and Using
//Java Tools


// Building HelloApp

public class chapter2 {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }

}



//C:\java\samples>javac HelloApp.java
//HelloApp.java:1: error: class, interface, or enum expected
//Public class HelloApp
//^
//1 error
//C:\java\samples

//C:\java\samples>javap HelloApp
//Compiled from "HelloApp.java"
//public class HelloApp{
//    public HelloApp();
//    public static void main(java.lang.String[]);
//}