package Book3.chapter6;
//Listing 6-3
//an Employee class contains a public field
//named address, which holds an instance of the Address class. As you can see,
//the clone method of the Employee class creates a shallow copy of the Employee
//object and then sets the copy’s address field to a clone of the original object’s
//address field. To make this example work, the Address class also overrides the
//clone method. Its clone method calls super.clone() to create a shallow copy of
//the Address object.
public class CloneTest2 {
    public static void main(String[] args) {
        Employee4 emp1 = new Employee4("Martinez", "Anthony");
        emp1.setSalary(40000.0);
        emp1.address = new Address("1300 N. First Street", "Fresno", "CA", "93702");

        Employee4 emp2 = (Employee4) emp1.clone();
        System.out.println("**** after cloning ****\n");
        printEmployee(emp1);
        printEmployee(emp2);

        emp2.setLastName("Smith");
        emp2.address = new Address("2503 N. 6th Street", "Fresno", "CA", "93722");
        System.out.println("**** after changing emp2 ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
    }

    private static void printEmployee(Employee4 e) {
        System.out.println(e.getFirstName() + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
}

class Employee4 implements Cloneable {
    private String lastName;
    private String firstName;
    private Double salary;
    public Address address;

    public Employee4(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Employee4 clone() {
        Employee4 emp;
        try {
            emp = (Employee4) super.clone();
            emp.address = (Address) address.clone(); // Deep copy of address
        } catch (CloneNotSupportedException e) {
            return null; // Will never happen
        }
        return emp;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + ", " + this.salary + "]";
    }
}

class Address implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // Will never happen
        }
    }

    public String getAddress() {
        return this.street + "\n" + this.city + ", " + this.state + " " + this.zipCode;
    }
}
