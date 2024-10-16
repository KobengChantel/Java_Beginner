package Book4.chapter3;
//UPDATING ELEMENTS
// use the set method to replace an existing object with another object.

import java.util.ArrayList;


class Employee7 {
    private String lastName;
    private String firstName;

    // Constructor for Employee class
    public Employee7(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Method to change the employee's name
    public void changeName(String newLastName, String newFirstName) {
        this.lastName = newLastName;
        this.firstName = newFirstName;
    }

    // Override toString method for printing employee details
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class UpdateElements {
    public static void main(String[] args) {
        // Updating elements in an ArrayList of strings
        ArrayList<String> nums = new ArrayList<>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        System.out.println("Original List: " + nums);

        // Update elements
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        System.out.println("Updated List: " + nums);

        // Create an ArrayList of Employee7 objects
        ArrayList<Employee7> emps = new ArrayList<>(); // Changed to Employee7

        // Add employees to the array list
        emps.add(new Employee7("Addams", "Gomez"));
        emps.add(new Employee7("Taylor", "Andy"));
        emps.add(new Employee7("Kirk", "James"));

        // Print the employee list
        System.out.println("Employees: " + emps);

        // Change one of the employee's names
        Employee7 e = emps.get(1); // Ensure you are getting an Employee7
        e.changeName("Petrie", "Robert");

        // Print the employee list again
        System.out.println("Updated Employees: " + emps);
    }
}
