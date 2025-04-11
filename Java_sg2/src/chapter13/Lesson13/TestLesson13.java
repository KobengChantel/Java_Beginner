package chapter13.Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLesson13 {
    public static void main(String[] args) {
        //reference is superclass
//        Shirt shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L');
//        Clothing trouser01 = new Trouser(2, "slacks", 'T', 199.90, 'M', 'F');
//
//        System.out.println(shirt01.doReturn());
//        System.out.println(shirt01);
//        System.out.println();
//        System.out.println(trouser01);
//        Trouser t1 = new Trouser();
//        Clothing c1 = new Trouser();
//        Returnable r1 = new Trouser();
//
//        ((Trouser) r1).getFit();
//
//        t1.display();
//        t1.doReturn();
//        t1.getFit();
//
//        c1.getDesc();
//        c1.getItemID();
//
//        r1.doReturn();
//
//        if(r1 instanceof Trouser) {
//            char fit = ((Trouser)r1).getFit();
//            System.out.println("These pants are size: " + fit);
//        }

        String[] nums = {"One", "Two", "Three"};
        //array -----> List
        List<String> myList = Arrays.asList(nums);
        //List ----> ArrayList
        ArrayList<String> myArrayList = new ArrayList(myList);

        String[] names = {"Ned", "Fred", "Rick", "Alice", "Jessie"};
        List<String> namesList = new ArrayList(Arrays.asList(names));

        for(String n: namesList) {
            System.out.print(n.toUpperCase() + ", ");
        }
        System.out.println("After for loop: " + namesList);
        //unary lambda
        namesList.replaceAll(n -> n.toUpperCase());
        System.out.println("List.replaceAll lambda: " + namesList);
//      predicate lambda
        namesList.removeIf(n -> n.equalsIgnoreCase("Rick"));
        System.out.println("Predicate Lambda (Removes Rick): " + namesList);
//      removing names less than 5 characters long
        namesList.removeIf(n -> n.length() < 5);
        System.out.println("Predicate Lambda (removes if name capacity is less than 5): " + namesList);
    }
}