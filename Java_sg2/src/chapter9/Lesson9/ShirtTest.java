package chapter9.Lesson9;

public class ShirtTest {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt();
        char colourCode;
        colourCode = shirt01.getColourCode();
        System.out.println("Get Colour: " + colourCode );

        shirt01.setColourCode('T');
        colourCode = shirt01.getColourCode();
        System.out.println("Set Colour: " + colourCode);

        shirt01.setColourCode('B');
        colourCode = shirt01.getColourCode();
        System.out.println("Set Colour: " + colourCode);

//        Shirt shirt02 = new Shirt("Outdoors Shirt", 'R', 39.99);
//        System.out.println("This " + shirt02.getDescr() + " costs R" + shirt02.getPrice());


    }
}