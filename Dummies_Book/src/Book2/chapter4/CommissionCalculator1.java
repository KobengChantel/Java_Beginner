package Book2.chapter4;
// if-else statement adds an additional element to a basic if statement: a state-
//ment or block that’s executed if the boolean expression is not true.
public class CommissionCalculator1 {

        public static void main(String[] args) {
            double salesTotal = 12000.0; // Example sales total
            double commissionRate;

            if (salesTotal <= 10000.0) {
                commissionRate = 0.02; // 2% commission
            } else {
                commissionRate = 0.05; // 5% commission
            }

            double commissionAmount = salesTotal * commissionRate;
            System.out.println("Commission Rate: " + commissionRate);
            System.out.println("Commission Amount: " + commissionAmount);
        }
    }


