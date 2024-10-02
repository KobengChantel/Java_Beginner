package Book2.chapter1;

//LISTING 1;4

//// This class creates a Greeter object
//// that displays a hello message
//// in a dialog box.

//import statement is to let the compiler know that the program
//is using a class that’s defined by the Java API called JOptionPane
import javax.swing.JOptionPane;

public class GreeterClass2 {
    public void sayHello() {
        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
