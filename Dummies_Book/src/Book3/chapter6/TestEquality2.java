package Book3.chapter6;
//Listing 6-1 shows a program that compares two Employee
//objects by using a properly constructed equals method.
//You can override the equals method so that objects can be compared based on
//their values
public class TestEquality2 {
    public static void main(String[] args)
    {
        Employee5 emp1 = new Employee5(
                "Martinez", "Anthony");
        Employee5 emp2 = new Employee5(
                "Martinez", "Anthony");
        if (emp1.equals(emp2))
        System.out.println(
                "These employees are the same.");
else
        System.out.println(
                "These are different employees.");
    }
}
class Employee5
        {
private String lastName;
private String firstName;
public Employee5(String lastName, String firstName)
{
    this.lastName = lastName;
    this.firstName = firstName;
}
public String getLastName()
{
    return this.lastName;
}
            public String getFirstName()
            {
                return this.firstName;
            }
            public boolean equals(Object obj)
            {
// an object must equal itself
                if (this == obj)
                return true;
// no object equals null
                if (this == null)
                return false;
// objects of different types are never equal
                if (this.getClass() != obj.getClass())
                return false;
// cast to an Employee, then compare the fields
                Employee5 emp = (Employee5) obj;
                return this.lastName.equals(emp.getLastName())
                    && this.firstName.equals(emp.getFirstName());
            }
        }