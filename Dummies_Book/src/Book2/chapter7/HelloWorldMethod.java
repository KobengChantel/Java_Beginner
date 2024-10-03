package Book2.chapter7;

// program in which the message is displayed not by the main
//method, but by a method named sayHello that’s called by the main method

//public class HelloWorldMethod {
//    public static void main(String[] args) {
//        sayHello();
//    }
//
//    public static void sayHello()
//    {
//        System.out.println("Hello, World!");
//    }
//}


//version of the program works exactly like the preceding version.

public class HelloWorldMethod {
    public static void sayHello()
    {
        System.out.println("Hello, World!");
    }
    public static void main(String[] args)
    {
        sayHello();
    }
}