package Book4.chapter3;
//DELETEING ELEMENTS
//ArrayList class provides several methods that let you remove elements from
//the collection. To remove all the elements, use the clear method

import java.util.ArrayList; // Import ArrayList

// Employee class definition
class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Override toString for meaningful output
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class DeleteElements {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();

        // Create employee objects
        Employee emp1 = new Employee("Addams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");

        // Add employee objects to array list
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        // Print the array list
        System.out.println("Employees before removal: " + emps);

        // Remove one of the employees
        emps.remove(emp2);

        // Print the array list again
        System.out.println("Employees after removal: " + emps);
    }
}
