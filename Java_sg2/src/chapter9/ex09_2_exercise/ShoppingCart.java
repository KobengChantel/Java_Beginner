package chapter9.ex09_2_exercise;

//2. Declare, instantiate, and initialize a new Customer object
//by calling the custom constructor.
//3. Test it by printing the customer object name
//        (call getName method).

public class ShoppingCart {
    public static void main(String args[]){

        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Kobeng", "3212");
//
        // Print the customer object name
        System.out.println("The Customer Name Is "+cust1.getName());


    }

}
