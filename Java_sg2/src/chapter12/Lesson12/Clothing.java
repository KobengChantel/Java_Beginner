package chapter12.Lesson12;

public class Clothing {
    //    fields
    private int itemID = 0;
    private String desc = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    //    constructors
    public Clothing(int itemID, String desc, char colourCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colourCode = colourCode;
        this.price = price;
    }

    public Clothing(double price) {
        this.price = price;
    }

    //    access modifiers
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColourCode() {
        return colourCode;
    }

    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //  method
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
    };
}
