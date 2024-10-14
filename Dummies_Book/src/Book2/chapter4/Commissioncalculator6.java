package Book2.chapter4;
// | and || operators
//The | and || operators are called Or operators because they return true if the first
//expression is true or if the second expression is true. They also return true if
//both expressions are true
public class Commissioncalculator6 {

        public static void main(String[] args) {
            double salesTotal = 800.0; // Example sales total
            int salesClass = 3;        // Example sales class
            double commissionRate;

            // Using the || (logical OR) operator - short-circuiting
            if ((salesTotal < 1000.0) || (salesClass == 3)) {
                commissionRate = 0.0;  // 0% commission if sales < $1000 or sales class is 3
            } else {
                commissionRate = 0.05; // Example default commission rate, set to 5%
            }

            System.out.println("Commission Rate with ||: " + commissionRate);

            // Using the | (bitwise OR) operator - non-short-circuiting
            if ((salesTotal < 1000.0) | (salesClass == 3)) {
                commissionRate = 0.0;  // 0% commission if sales < $1000 or sales class is 3
            } else {
                commissionRate = 0.05; // Example default commission rate, set to 5%
            }

            System.out.println("Commission Rate with |: " + commissionRate);
        }
    }


