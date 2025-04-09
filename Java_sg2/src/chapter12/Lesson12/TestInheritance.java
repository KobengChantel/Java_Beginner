package chapter12.Lesson12;

public class TestInheritance {
    public static void main(String[] args) {
        //reference is superclass
        Clothing shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L'); //polymorphism
        Shirt shirt02 = new Shirt(20.00, 'M');
        Clothing trouser01 = new Trouser(2, "slacks", 'T', 199.90, 'M', 'F');
        shirt01.display();
        shirt02.display();
        System.out.println();
        trouser01.getItemID();
        trouser01.display();

        //must cast as trouser because it's a clothing instance
        displayDetails(trouser01);
    }

    public static void displayDetails(Clothing c1) {
        ((Trouser)c1).getFit();
        if(c1 instanceof Trouser) {
            char fitcode = ((Trouser)c1).getFit();
            System.out.println("Fit: " + fitcode);
        }
    }
}

