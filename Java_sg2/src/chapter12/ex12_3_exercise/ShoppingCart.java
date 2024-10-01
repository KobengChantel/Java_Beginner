package chapter12.ex12_3_exercise;

//In the ShoppingCart class:
//3.  Declare and instantiate a Shirt object using an Item reference type.
//      Call the 3-arg constructor to assign values.
//4.  Call the display method of the object.
//5.  Use instanceof to confirm that the object is, indeed, a Shirt.
//6.  If it is a Shirt,
//      - cast the object to a Shirt and call the getColor method, assigning
//        the return value to a String variable.
//      - Print out the color name using a suitable label.
//7.  If it is not a Shirt, print a message to that effect.
//8.  Test your code.  You can test the non-Shirt object condition
//      by instantiating an Item object instead of a Shirt object.

public class ShoppingCart {

        public static void main(String[] args) {
            // declare and instantiate a Shirt object using an Item reference type
            Item item = new Shirt(25.99, 'M', 'G');

            // Test for non-Shirt object type
            //  Item item = new Item();

            // call the display method on the object, then the getColor method
            item.display();
            if (item instanceof Shirt) {
                String color = ((Shirt) item).getColor();
                System.out.println("Color: " + color);
            }else System.out.println("Item is not a Shirt.");
        }
    }

