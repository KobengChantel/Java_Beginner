//
//Exercise 4-2
//
//        1. Declare and initialize numeric fields. Include price and tax (double),
//quantity (int). Also declare a double called total, but do not initialize it.
//2. Change the message variable to include quantity
//        (example: "Mary Smith wants to purchase 1 Shirt.")
//3. Calculate total by multiplying price * quantity * tax.
//4. Print a message showing the total cost.
//        (example:  "Total cost with tax is: 25.78.")

        package Chapter4.ex04_2_exercise;

public class ShoppingCart {

    public static void main (String[] args){
      String custName = "MmaSetshaba Motse";
      String itemDesc = "Cap";
      String message = custName + " wants to purchase a " + itemDesc;
      //declare1. Declare and initialize numeric fields. Include price and tax (double),
        //quantity (int). Also declare a double called total, but do not initialize it.
        double price = 156.99;
        int quantity = 3;
        double tax = 3.04;
        double total;

        //2. Change the message variable to include quantity
        message = custName+" wants to purchase "+quantity+ " "+itemDesc;
System.out.println(message);
        //3. Calculate total by multiplying price * quantity * tax.
        total = quantity * price * tax;

        //4. Print a message showing the total cost.
        System.out.println("Total cost with tax: "+total);
    }
}
