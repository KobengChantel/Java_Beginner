public class GenQueueTest {

        public static void main(String[] args)
        {
            GenQueue<Employee> empList;
            empList = new GenQueue<Employee>();
            GenQueue<HourlyEmployee> hList;
            hList = new GenQueue<HourlyEmployee>();
            hList.enqueue(new HourlyEmployee(
                    "Trump", "Donald"));
            hList.enqueue(new HourlyEmployee(
                    "Gates", "Bill"));
            hList.enqueue(new HourlyEmployee(
                    "Forbes", "Steve"));
            empList.addItems(hList);
            while (empList.hasItems())
            {
                Employee emp = empList.dequeue();
                System.out.println(emp.firstName
                        + " " + emp.lastName);
            }
        }
    }
    class Employee
    {
        public String lastName;
        public String firstName;
        public Employee() {}
        public Employee(String last, String first)
        {
            this.lastName = last;
            this.firstName = first;
        }
        public String toString()
        {
            return firstName + " " + lastName;
        }
    }
    class HourlyEmployee extends Employee
    {
        public double hourlyRate;
        public HourlyEmployee(String last, String first)
        {
            super(last, first);
        }
    }

