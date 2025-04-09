package chapter12.Lesson12;

public class Trouser extends Clothing {
    private char fit;
    private char gender;

    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
        super(itemID,desc,colourCode,price);
        this.fit = fit;
        this.gender = gender;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + getFit());
        System.out.println("Gender: " + getGender());
    }
}
