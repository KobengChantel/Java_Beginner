package Book4.chapter3;
// way to access all the elements in an array list  is to use an iterator. An iterator is a special type of object whose sole purpose
//in life is to let you step through the elements of a collection


//iterator object implements the Iterator interface, which is defined as part
//of the java.util package. As a result, to use an iterator, you must import either
//java.util.Iterator or java.util.*. The Iterator interface defines just three
//methods, as listed in Table 3-2. These methods are all you need to access each
//element of a collection


import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {
    public static void main(String[] args) {
        // Initialize the ArrayList
        ArrayList<String> nums = new ArrayList<>();

        // Add elements to the list
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");

        // Create an iterator for the ArrayList
        Iterator<String> iterator = nums.iterator();

        // Iterate through the list and print each element
        while (iterator.hasNext()) {
            String s = iterator.next(); // No need for casting with generics
            System.out.println(s);
        }
    }
}

