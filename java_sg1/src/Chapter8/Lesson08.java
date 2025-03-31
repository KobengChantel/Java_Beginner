package Chapter8;

public class Lesson08 {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        Shirt shirt2 = new Shirt();
        shirt2.desc = "t-shirt";
        shirt2.colourCode = 'R';
        shirt2.price = 99.90;

        myShirt.display();
        shirt2.display();
    }
}

class Shirt {
    //    fields
    public String desc;
    public char colourCode;
    public double price;

//    constructor

//    public Shirt() {}

    public Shirt() {
        desc = "---description required---";
        colourCode = 'U';
        price = 0.00;
    }

    //    methods
    public void display() {
        System.out.println("Shirt description: " + desc);
        System.out.println("Colour code: " + colourCode);
        System.out.println("Price: " + price);
    }
}

