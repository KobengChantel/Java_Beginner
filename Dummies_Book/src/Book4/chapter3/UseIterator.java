package Book4.chapter3;
// way to access all the elements in an array list  is to use an iterator. An iterator is a special type of object whose sole purpose
//in life is to let you step through the elements of a collection


//iterator object implements the Iterator interface, which is defined as part
//of the java.util package. As a result, to use an iterator, you must import either
//java.util.Iterator or java.util.*. The Iterator interface defines just three
//methods, as listed in Table 3-2. These methods are all you need to access each
//element of a collection


public class UseIterator {
    public static void main(String[] args) {
        nums.add("Four");
        String s;
        Iterator e = nums.iterator();
        while (e.hasNext())
        {
            s = (String)e.next();
            System.out.println(s);
        }
    }
}
