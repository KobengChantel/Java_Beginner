package Chapter6;

public class Lesson6 {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        //changing fields values
        cust1.age = 40;
        cust2.name = "Duke";

        //accessing another class's method
        cust1.cart.cancel();

        //calling methods on our project
        cust1.displayCustomer();
        cust2.displayCustomer();

        Item[] items = {new Item(), new Item(), new Item()};
//        for
    }
}
class Customer{
    //fields
    public String name = "Junior Duke";
    public Cart cart = new Cart();
    public int custID = 1205;
    public String  address;
    public String orderNum;
    public int age;

    //method
    public void displayCustomer(){
        System.out.println("Customer: " + name);
    }

}
class Cart{
    public Item[] items;
    public String date;
    public double total;

    public void cancel(){
        System.out.println("Cancelling order");
    }
}
class Item{
public String itemName;
}

//stack memory stores variable
//object will be stored on the heap