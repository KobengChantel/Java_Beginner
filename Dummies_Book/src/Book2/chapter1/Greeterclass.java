package Book2.chapter1;

//LISTING1:3


// Define the Greeter class
class Greeter {
    // Method to print a greeting
    public void sayHello() {
        System.out.println("Hello, world!");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a new instance of the Greeter class
        Greeter myGreeterObject = new Greeter(); // Instantiate the Greeter object

        // Call the sayHello method to print the greeting
        myGreeterObject.sayHello(); // Output the greeting
    }
}
