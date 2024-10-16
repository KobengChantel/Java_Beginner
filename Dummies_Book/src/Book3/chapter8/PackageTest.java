package Book3.chapter8;

// Importing the Console1 class to use its methods
//import com.lowewriter.util.Console1;

public class PackageTest {
    public static void main(String[] args) {
        // Loop until the user decides to stop
        while (Console1.askYorN("Keep going?")) {
            System.out.println("D'oh!");
        }
        // Close the scanner when done
        Console1.close();
    }
}
