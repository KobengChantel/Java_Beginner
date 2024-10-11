package Book4.chapter3;
//DELETEING ELEMENTS
//ArrayList class provides several methods that let you remove elements from
//the collection. To remove all the elements, use the clear method

public class DeleteElements {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();
// create employee objects
        Employee emp1 = new Employee("Addams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
// add employee objects to array list
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
// print the array list
        System.out.println(emps);
// remove one of the employees
        emps.remove(emp2);
// print the array list again
        System.out.println(emps);
    }
}
