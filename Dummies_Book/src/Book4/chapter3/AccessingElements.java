package Book4.chapter3;
// ACCESSING ELEMENTS
// access a specific element in an array list, you can use the get method, which
//specifies the index value of the element you want to retrieve

//easiest way to access all the elements in an array list is to use an enhanced for
//statement, which lets you retrieve the elements without bothering with indexes or
//the get method//

public class AccessingElements {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < nums.size(); i++)
            System.out.println(nums.get(i));
        //for statemebnt
        for (String s : nums)
            System.out.println(s);
//        enhanced for loop
        for (String s : nums)
        {
            int i = nums.indexOf(s);
            System.out.println("Item " + i + ": " + s);

        }
}
