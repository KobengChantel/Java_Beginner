package Book2.chapter4;

public class CommissionCalculator2 {
//use blocks for either or both of the statements in an if-else statement.
    public static void main(String[] args) {
        // Initialize a sample sales total for this example
        double salesTotal = 12000.0; // Example sales total

        // Variables to store commission rate and counts for each level
        double commissionRate;
        int level1Count = 0;  // Counter for sales at or below $10,000
        int level2Count = 0;  // Counter for sales above $10,000

        // Determine commission rate based on salesTotal
        if (salesTotal <= 10000.0) {
            commissionRate = 0.02;  // Set commission to 2% for sales at or below $10,000
            level1Count++;          // Increment level 1 sales count
        } else {
            commissionRate = 0.05;  // Set commission to 5% for sales above $10,000
            level2Count++;          // Increment level 2 sales count
        }

        // Calculate the commission amount based on sales total and commission rate
        double commissionAmount = salesTotal * commissionRate;

        // Output the results
        System.out.println("Commission Rate: " + commissionRate);        // Display the commission rate
        System.out.println("Commission Amount: " + commissionAmount);    // Display the commission amount earned
        System.out.println("Level 1 Sales Count: " + level1Count);       // Display the count of level 1 sales
        System.out.println("Level 2 Sales Count: " + level2Count);       // Display the count of level 2 sales
    }
}
