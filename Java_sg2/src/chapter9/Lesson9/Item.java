package chapter9.Lesson9;

public class Item {
    private double price = 15.50;

    public void setPrice(Customer cust) {
        if (cust.hasLoyaltyDiscount()) {
            price = price * 0.85;
            System.out.println("Price with Discount: R" + price);
        }
        else {
            System.out.println("Price is: R" + price);
        }
    }
}