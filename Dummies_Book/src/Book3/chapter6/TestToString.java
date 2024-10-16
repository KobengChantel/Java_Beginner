package Book3.chapter6;
//od returns a String representation of an object. By default, the
//toString method returns the name of the object’s class plus its hash code. In the
//sections that follow, I show you how to use the toString method and how to over-
//ride it in your own classes to create more useful strings.
public class TestToString {

    public static void main(String[] args)
    {
        Employee6 emp = new Employee6("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}
class Employee6
{
    private String lastName;
    private String firstName;
    public Employee6(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}

