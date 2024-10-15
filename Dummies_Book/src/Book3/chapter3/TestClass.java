package Book3.chapter3;

//A static method is a method declared with the static keyword. L
//One of the basic rules of working with static methods is that you can’t access a
//nonstatic method or field from a static method, because the static method doesn’t
//have an instance of the class to use to reference instance methods or fields. The
//following code won’t compile

public class TestClass {
    private int x = 5; // an instance field
    public static void main(String[] args) {
        // int y = x; // error: won't compile
        int y = 5;
    }
}

