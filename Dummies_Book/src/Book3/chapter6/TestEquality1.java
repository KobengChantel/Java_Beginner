package Book3.chapter6;
//The equals Method
//Testing objects to see whether they are equal is one of the basic tasks of any
//object-oriented programming language. Unfortunately, Java isn’t very good at it.
//Consider this program
public class TestEquality1 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Martinez", "Anthony");
        Employee2 emp2 = new Employee2("Martinez", "Anthony");

        // Use .equals() method to compare Employee2 objects
        if (emp1.equals(emp2))
            System.out.println("These employees are the same.");
        else
            System.out.println("These are different employees.");
    }
}

class Employee2 {
    private String lastName;
    private String firstName;

    // Constructor for Employee2 class
    public Employee2(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Override equals method for content-based comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee2 employee2 = (Employee2) obj;
        return lastName.equals(employee2.lastName) && firstName.equals(employee2.firstName);
    }
}
