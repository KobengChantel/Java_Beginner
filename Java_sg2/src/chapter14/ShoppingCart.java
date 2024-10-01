package chapter14;

//In the ShoppingCart class:
//        2.  Surround the code that calls the divide method
//with a try / catch block.  Handle the exception
//object by printing it to the console.
//3.  Run the ShoppingCart to view the outcome.

public class ShoppingCart {

        public static void main(String[] args){
            Calculator calc = new Calculator();
            int addResult = calc.add(43, 79);
            System.out.println("Add Result: "+addResult);

            // Handle possible ArithmeticException
            try {
                double divResult = calc.divide(15, 0);
                System.out.println("Division Result: "+divResult);
            }catch (ArithmeticException ae){
                System.out.println(ae);
            }
        }
    }


