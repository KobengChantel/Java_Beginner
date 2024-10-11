package Book3.chapter6;
//The equals Method
//Testing objects to see whether they are equal is one of the basic tasks of any
//object-oriented programming language. Unfortunately, Java isn’t very good at it.
//Consider this program
public class TestEquality1 {
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Martinez", "Anthony");
        Employee emp2 = new Employee("Martinez", "Anthony");
        if (emp1 == emp2)
            System.out.println(
                    "These employees are the same.");
        else
            System.out.println(
                    "These are different employees.");
    }
}
class Employee
{
    private String lastName;
    private String firstName;
}
public Employee(String lastName, String firstName)
{
    this.lastName = lastName;
    this.firstName = firstName;
}

