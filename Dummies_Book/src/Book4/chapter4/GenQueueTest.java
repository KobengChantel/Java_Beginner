package Book4.chapter4;

// Class to test the functionality of the GenQueue with Employees
public class GenQueueTest {
    // Default constructor for GenQueueTest
    public GenQueueTest() {
    }

    // Main method to execute test cases for GenQueue
    public static void main(String[] args) {
        // Create a generic queue to hold Employees
        GenQueue<Employees> empList = new GenQueue<>();
        // Create a generic queue to hold HourlyEmployees
        GenQueue<HourlyEmployees> hList = new GenQueue<>();

        // Enqueue HourlyEmployees into the hList
        hList.enqueue(new HourlyEmployees("Trump", "Donald")); // Adding Donald Trump
        hList.enqueue(new HourlyEmployees("Gates", "Bill"));   // Adding Bill Gates
        hList.enqueue(new HourlyEmployees("Forbes", "Steve")); // Adding Steve Forbes

        // Transfer all items from hList to empList
        empList.addItems(hList);

        // Dequeue and print each employee's name from empList
        while (empList.hasItems()) {
            // Dequeue an employee from empList
            Employees emp = (Employees) empList.dequeue();
            // Print the first and last name of the employee
            System.out.println(emp.firstName + " " + emp.lastName);
        }
    }
}
