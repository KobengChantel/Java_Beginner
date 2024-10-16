package Book3.chapter8;
//LISTING 8.1
//USING JAVADOC COMMENTS


// package com.lowewriter.payroll;
/** Represents an employee.
 * @author Doug Lowe
 * @version 1.5
 * @since 1.0
 */
public class Employee {
    private String lastName;
    private String firstName;
    private Double salary;
    /** Represents the employee's address. */
    public Address address;

    /** Creates an employee with the specified name.
     * @param lastName The employee's last name.
     * @param firstName The employee's first name.
     */
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
    }

    /** Gets the employee's last name.
     * @return A string representing the employee's last name.
     */
    public String getLastName() {
        return this.lastName;
    }

    /** Sets the employee's last name.
     * @param lastName A String containing the employee's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** Gets the employee's first name.
     * @return A string representing the employee's first name.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /** Sets the employee's first name.
     * @param firstName A String containing the employee's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** Gets the employee's salary.
     * @return A double representing the employee's salary.
     */
    public double getSalary() {
        return this.salary;
    }

    /** Sets the employee's salary.
     * @param salary A double containing the employee's salary.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

/** Represents an address for an employee. */
class Address implements Cloneable {
    public String street;
    public String city;
    public String state;
    public String zipCode;

    /** Default constructor for Address. */
    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    /** Creates an address with specified fields.
     * @param street The street address.
     * @param city The city of the address.
     * @param state The state of the address.
     * @param zipCode The ZIP code of the address.
     */
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /** Override the clone method to support deep copying of Address. */
    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // This should never happen
        }
    }

    /** Returns the full address as a formatted string.
     * @return A string representation of the address.
     */
    public String getAddress() {
        return this.street + "\n" + this.city + ", " + this.state + " " + this.zipCode;
    }
}
