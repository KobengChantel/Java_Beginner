package Book3.chapter7;
//USING LAMBDA EXPRESSION
//lambda expression lets you
//create an anonymous class that implements a specific type of interface called a
//functional interface — which has one and only one abstract method

//A lambda expression is a concise way to create an anonymous class that imple-
//ments a functional interface. Instead of providing a formal method declaration
//that includes the return type, method name, parameter types, and method body,
//you simply define the parameter types and the method body

public class LambdaBall {
    public static void main(String[] args) {
        Ball b = () -> {
            System.out.println("You hit it!");
        };
        b.hit();
    }

    interface Ball {
        void hit();
    }
}
