package chapter12.Lesson12;

public class Shirt extends Clothing {
    private char fit = 'U';

    public Shirt(int itemID, String desc, char colourCode, double price, char fit) {
        //links to superclass(always first line of subclass constructor!!!!)
        super(itemID, desc, colourCode, price);
        this.fit = fit;
    }

    //    overloaded constructor
    public Shirt(char fit) {
        this(15.00, fit);
    }

    public Shirt(double price, char fit) {
        super(price);
        this.fit = fit;
    }
    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    //    overridden method
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + fit);
    }

    public void setColourCode(char colourCode) {
        super.setColourCode(colourCode);
    }
}

