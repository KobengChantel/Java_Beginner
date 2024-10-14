package Book2.chapter4;
//goes in the if or else part of an if-else statement can be any
//kind of Java statement, including another if or if-else statement.
// nesting, and an if or if-else statement that includes another if or
//if-else statement is called a nested if statement.
public class CommissionCalculator3 {

        public static void main(String[] args) {
            // Initialize sales class and sales total with example values
            int salesClass = 2;
            double salesTotal = 15000.0;
            double commissionRate;       // Variable to store the commission rate

            // Determine commission rate based on sales class and sales total
            if (salesClass == 1) {      // Check if sales class is 1
                if (salesTotal < 10000.0) {  // For sales class 1, check if sales total is under $10,000
                    commissionRate = 0.02;   // Set commission to 2% for sales class 1, sales under $10,000
                } else {
                    commissionRate = 0.04;   // Set commission to 4% for sales class 1, sales of $10,000 or more
                }
            } else {                    // If sales class is not 1
                if (salesTotal < 10000.0) {  // For other sales classes, check if sales total is under $10,000
                    commissionRate = 0.025;  // Set commission to 2.5% for other sales classes, sales under $10,000
                } else {
                    commissionRate = 0.05;   // Set commission to 5% for other sales classes, sales of $10,000 or more
                }
            }

            // Calculate the commission amount
            double commissionAmount = salesTotal * commissionRate;

            // Output the commission rate and amount
            System.out.println("Commission Rate: " + commissionRate);
            System.out.println("Commission Amount: " + commissionAmount);
        }
    }


