package Book2.chapter1;

//LISTING 1;4

//// This class creates a Greeter object
//// that displays a hello message
//// in a dialog box.

//import statement is to let the compiler know that the program
//is using a class that’s defined by the Java API called JOptionPane
import javax.swing.JOptionPane;

public class GreeterClass2 {

    // Method to show a greeting message in a dialog
    public void sayHello() {
        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of GreeterClass2
        GreeterClass2 myGreeterObject = new GreeterClass2();

        // Call the sayHello method to show the greeting message
        myGreeterObject.sayHello();
    }
}
