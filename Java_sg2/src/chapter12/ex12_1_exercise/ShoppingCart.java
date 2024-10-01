package chapter12.ex12_1_exercise;

//In the ShoppingCart class,
//        6.  Declare and instantiate a Shirt object, using the 3 arg constructor.
//        7.  Call the display() method on the object reference.
//Where is the display method coded?


public class ShoppingCart {


        public static void main(String[] args) {
            // instantiate a Shirt object and call the display() method
            Shirt shirt = new Shirt(25.99, 'M', 'P');
            shirt.display();
        }
    }

