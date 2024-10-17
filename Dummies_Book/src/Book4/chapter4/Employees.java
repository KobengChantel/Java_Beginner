package Book4.chapter4;

// Class representing an employee with a first and last name
public class Employees {

    // Instance variables to hold the employee's first and last name
    public String lastName;  // The last name of the employee
    public String firstName; // The first name of the employee

    // Default constructor for Employees class
    public Employees() {
    }

    // Constructor that initializes an employee's first and last name
    public Employees(String last, String first) {
        this.lastName = last;  // Assign the last name
        this.firstName = first; // Assign the first name
    }

    // Override the toString method to provide a string representation of the employee
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName; // Returns the full name
    }
}
