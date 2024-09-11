package Chapter8.ex08_2_exercise;

public class Item {

    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    // Existing displayItem method
    public void displayItem() {
        System.out.println("Item: " + desc + ", Quantity: " + quantity + ", Price: $"
                + price + ", Color Code: " + colorCode);
    }

    // 3-arg setItemFields method
    public void setItemFields(String desc, int qty, double pr) {
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;
    }

    // 4-arg setItemFields method that returns an int
    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            this.colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else {
            return -1; // Invalid color code
        }
    }

    // New print method (optional, if you prefer separate from displayItem)
    public void printItemDetails() {
        System.out.println("---- Item Details ----");
        System.out.println("Description: " + desc);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Color Code: " + colorCode);
    }
}



