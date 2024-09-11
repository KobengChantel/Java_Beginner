

//Exercise 5-1:
package Chapter5.ex05_1_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "MmaSetshaba Motse";
        String itemDesc = "Cap";

        // numeric fields
        double price = 156.99;
        int quantity = 3;
        double tax = 3.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;
//        1. Declare a boolean, outOfStock, and initialize it to true.
//        boolean outOfStock = false;
        boolean outOfStock = true;

//        2. Use an if statement to test the value of quantity.

//If it is > 1, concatenate an 's' to message so that it indicates multiple items.
        if (quantity > 1) {
            message = message + "s";
        }


//        3. Use an if | else statement that tests the value of outOfStock.
//        If true, let the user know the item is unavailable.
        if (outOfStock) {
            System.out.println(itemDesc + " is out of stock.");
        }
//If false, print the message variable, then print the total cost with tax.
//        4. Run with outOfStock = true and then again with outOfStock = false.
        else {
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);
        }
    }
}