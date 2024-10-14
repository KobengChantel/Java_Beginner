package Book2.chapter4;
//combining the logical operators
public class CommissionCalculator {
    public static void main(String[] args) {
            // Sample values for salesTotal, salesClass, a, b, and c
            double salesTotal = 4500.0; // Change this value for testing different sales totals
            int salesClass = 1;          // Change this value to test different sales classes
            int a = 1;                   // Change these values for testing logical conditions
            int b = 2;
            int c = 3;

            double commissionRate = 0.0; // Initialize commission rate

            // Calculate commission rate based on sales total and class
            if (salesTotal < 1000.0) {
                commissionRate = 0.0; // Set commission rate to 0.0 if sales total is less than $1000
            } else if ((salesTotal < 5000.0) && (salesClass == 1)) {
                commissionRate = 0.0; // Set commission rate to 0.0 if sales total is less than $5000 and class is 1
            } else if ((salesTotal < 10000.0) && (salesClass == 2)) {
                commissionRate = 0.0; // Set commission rate to 0.0 if sales total is less than $10000 and class is 2
            }

            // Check another condition for commission rate reset
            if ((salesTotal < 1000.0) ||
                    ((salesTotal < 5000.0) && (salesClass == 1)) ||
                    ((salesTotal < 10000.0) && (salesClass == 2))) {
                commissionRate = 0.0; // Reset commission rate to 0.0 if any of the conditions are met
            }

            // Check conditions for printing a message
            if ((a == 1 && b == 2) || c == 3) {
                // Print message if either condition is true
                System.out.println("It's true!");
            } else {
                // Print message if none of the conditions are met
                System.out.println("No it isn't!");
            }
        }
    }


