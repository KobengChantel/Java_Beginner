package Chapter8;

public class Lesson8 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double den = 2.0;

        calc.calculate(3, den);
        calc.printString();
        System.out.println(calc.sum(4, 6));
        System.out.println(calc.isGreater(20, 5));

        int n1 = 1, n2 = 2;
        int result = n1 + n2;
        System.out.println(result);
//
        int num1 = 1, num2 = 2;
        int res = sum(num1, num2);
        System.out.println(res);

        int total = calc.sum(1, 2);
        float total2 = calc.sum(12.3F, 2.9F);
        float total3 = calc.sum(1, 29.87F);
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }

    //static keyword allows us to access method without creating an instance of object
    //w/o static we'll need to create an instance
    //used when objects have shared values
    public static int sum(int x, int y) {
        return (x + y);
    }

//        Item item1 = new Item();
//        Item item2 = new Item();
//        item1.setSize(ItemSizes.mMed);
}

final class Calculator {

    public void calculate(int x, double y) {
        System.out.println(x / y);
    }

    public void printString() {
        System.out.println("Hello");
    }

    public static int sum(int num1, int num2) {
        System.out.println("Method One: ");
        return num1 + num2;
    }

    public static float sum(float num1, float num2) {
        System.out.println("Method Two: ");
        return num1 + num2;
    }

    public static float sum(int num1, float num2) {
        System.out.println("Method Three: ");
        return num1 + num2;
    }
//static keword allow us to access method witout creating  an
    //static we will need to create an instance
    //used when objects have shared values
    public boolean isGreater(int x, int y) {
        return (x > y);
    }
}

class CalculatorTest {

    public static void main(String[] args) {
        int total = Calculator.sum(1, 2);
        float total2 = Calculator.sum(12.3F, 2.9F);
        float total3 = Calculator.sum(1, 29.87F);
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }
}

class ItemSizes {
    static final String mSmall = "Men's Small";
    static final String mMed = "Men's Medium";
}
