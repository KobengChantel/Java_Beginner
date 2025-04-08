package chapter9.Lesson9;

public class Shirt {
    private int shirtID = 0;
    private String descr = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    //no arguments
    public Shirt() {
        setColourCode('U');
    }

    //one argument
    public Shirt(char colourCode) {
        setColourCode(colourCode);
    }

    //two arguments
    public Shirt(char colourCode, double price) {
        this(colourCode);
        setPrice(price);
    }

    //three arguments
    public Shirt(String descr, char colourCode, double price) {
        setDescr(descr);
        setColourCode(colourCode);
        setPrice(price);
    }

//    returns colourCode value
    public char getColourCode() {
        return colourCode;
    }

    public void setColourCode(char newCode) {
        if(newCode == 'R') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'G') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'B') {
            colourCode = newCode;
            return;
        }
        System.out.println("Invalid colourCode. Use R, G or B");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}