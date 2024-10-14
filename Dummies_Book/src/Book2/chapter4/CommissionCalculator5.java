package Book2.chapter4;
// & and && operators
// & and && operators combine two boolean expressions and return true only
//if both expressions are true

public class CommissionCalculator5 {

        public static void main(String[] args) {
            int salesClass = 1;         //  sales class
            double salesTotal = 12000.0; //  sales total
            double commissionRate;

            //&& is the logical AND operator. It only evaluates the second condition if
            // the first condition is true (short-circuiting).

            // Using the && (logical AND) operator - short-circuiting
            if ((salesClass == 1) && (salesTotal >= 10000.0)) {
                commissionRate = 0.025;  // 2.5% commission for sales class 1, sales >= $10,000
            } else {
                commissionRate = 0.01;   // default rate, set to 1%
            }

            System.out.println("Commission Rate with &&: " + commissionRate);

            //& is the bitwise AND operator. However, when used with boolean values, it evaluates both conditions regardless of the first condition’s result (non-short-circuiting).

            // Using the & (bitwise AND) operator - non-short-circuiting
            if ((salesClass == 1) & (salesTotal >= 10000.0)) {
                commissionRate = 0.025;  // 2.5% commission for sales class 1, sales >= $10,000
            } else {
                commissionRate = 0.01;   //  default rate, set to 1%
            }

            System.out.println("Commission Rate with &: " + commissionRate);
        }
    }


