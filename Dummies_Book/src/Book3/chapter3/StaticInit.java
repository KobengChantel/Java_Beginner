package Book3.chapter3;
//USING STATIC INITIALIZER

//initializer blocks that you can use to initial-
//ize instance variables. Initializer blocks aren’t executed until an instance of a class
//is created, so you can’t count on them to initialize static fields.

//example of a class that contains a static initializer
public class StaticInit {
    public static int x;
    static
    {
        x = 32;
    }
// other class members such as constructors and
// methods go here...
}
