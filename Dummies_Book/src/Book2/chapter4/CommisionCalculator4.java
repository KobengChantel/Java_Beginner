package Book2.chapter4;
//else if statements
//for nested if statements is to have a series of if-else state-
//ments with another if-else
public class CommisionCalculator4 {

        public static void main(String[] args) {
            // Initialize sales total with an example value
            double salesTotal = 7500.0; // Example sales total
            double commissionRate;      // Variable to store the commission rate

            // Determine commission rate based on sales total
            if (salesTotal >= 10000.0) {           // Sales of $10,000 or more
                commissionRate = 0.05;             // 5% commission for sales >= $10,000
            } else if (salesTotal >= 5000.0) {     // Sales between $5,000 and $9,999.99
                commissionRate = 0.035;            // 3.5% commission for sales >= $5,000 and < $10,000
            } else if (salesTotal >= 1000.0) {     // Sales between $1,000 and $4,999.99
                commissionRate = 0.02;             // 2% commission for sales >= $1,000 and < $5,000
            } else {                               // Sales below $1,000
                commissionRate = 0.0;              // No commission for sales < $1,000
            }

            // Calculate the commission amount by multiplying the sales total by the commission rate
            double commissionAmount = salesTotal * commissionRate;

            // Output the results
            System.out.println("Commission Rate: " + commissionRate);        // Display the determined commission rate
            System.out.println("Commission Amount: " + commissionAmount);    // Display the calculated commission amount
        }
    }


