package Book2.chapter2;

//A Class That Demonstrates Shadowinp

//LISTING2:2

public class ShadowApp {

        // Static variable 'x' shared across all instances of the class
        static int x;

        public static void main(String[] args) {
            // Assign the value 5 to the static variable 'x'
            x = 5;
            // Print the value of the static variable 'x'
            System.out.println("x = " + x);

            // Declare a new local variable 'x'
            int x;
            // Assign the value 10 to the local variable 'x'
            x = 10;
            // Print the value of the local variable 'x'
            System.out.println("x = " + x);

            // Print the value of the static variable 'x' from the ShadowApp class
            System.out.println("ShadowApp.x = " + ShadowApp.x);
        }
    }

