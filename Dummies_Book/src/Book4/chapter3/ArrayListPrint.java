package Book4.chapter3;
// PRINTING AN ARRAYLIST
//toString method of the ArrayList class (as well as other collection classes)
//is designed to make it easy to quickly print out the contents of the list. It returns
//the contents of the array list enclosed in a set of brackets, with each element value
//separated by commas. The toString method of each element is called to obtain
//the element value
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        System.out.println(nums);
    }
}
