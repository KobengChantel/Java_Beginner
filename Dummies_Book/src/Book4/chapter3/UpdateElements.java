package Book4.chapter3;
//UPDATING ELEMENTS
// use the set method to replace an existing object with another object.

public class UpdateElements {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.clear();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        System.out.println(nums);
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        System.out.println(nums);
    }
    ArrayList<Employee> emps = new ArrayList<Employee>();
// add employees to array list
emps.add(new Employee("Addams", "Gomez"));
emps.add(new Employee("Taylor", "Andy"));
emps.add(new Employee("Kirk", "James"));
// print array list
System.out.println(emps);
    // change one of the employee's names
    Employee e = emps.get(1);
e.changeName("Petrie", "Robert");
// print the array list again
System.out.println(emps);
}
