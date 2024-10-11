package Book3.chapter6;

//Overriding toString
//Override the toString method in your classes. In fact, one
//of the basic guidelines of object-oriented programming in Java is to always override toString.
//  a simple program with an Employee class that overrides
//toString
public class TestToString1 {
    public static void main(String[] args)
    {
        Employee1 emp = new Employee1("Martinez",
"Anthony");
        System.out.println(emp.toString());
    }
}
class Employee1
{
    private String lastName;
    private String firstName;
    public Employee1(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String toString()
    {
        return "Employee["
                + this.firstName + " "
                + this.lastName + "]";
    }
}

