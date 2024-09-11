

package Chapter5.ex05_3_exercise;
//Exercise 5-3
//
//        1. Create a for loop that iterates through the items array,
//displaying each element. Precede the list of elements with
//the message, "Items purchased: ".



public class ShoppingCart {

    public static void main(String[] args) {
        // Local variables
        String custName = "Mary Smith";
        double price = 21.99;
        int quantity = 2;
        double taxRate = 0.04; // 4% tax
        double tax = price * taxRate;
        double totalPrice = (price + tax) * quantity;

        String[] items = {"Shirt", "Belt", "Scarf", "Skirt"};

        // Display customer message
        String message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Display items purchased
        System.out.println("Items purchased: ");
        for (int i = 0; i < items.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(items[i]);
        }
        System.out.println(); // Move to next line after list of items

        // Display total price
        System.out.printf("Price per item: $%.2f\n", price);
        System.out.printf("Quantity: %d\n", quantity);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total Price: $%.2f\n", totalPrice);
    }
}



