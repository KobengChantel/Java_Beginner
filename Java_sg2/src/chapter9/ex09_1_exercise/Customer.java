package chapter9.ex09_1_exercise;
//1. Encapsulate this class.  Change access modifiers so that fields can
//     be read or changed on through public methods.
//     The ssn field should be READ ONLY.

public class Customer {
    private String name;
    private String ssn;

    // Constructor to initialize the ssn field
    public Customer(String ssn) {
        this.ssn = ssn;
    }
    // Encapsulate this class.  Make ssn read only.

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getSSN(){
        return ssn;
    }
    public static void main(String[] args) {
        chapter9.ex09_2_exercise.Customer customer = new chapter9.ex09_2_exercise.Customer("Kobeng Chantel", "123-45-6789");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer SSN: " + customer.getSSN());
    }
}
