package Book2.chapter4;
//if statement is one of the most important statements in any programming
//language, and Java is no exception.
public class CommissionRate {



        public static void main(String[] args) {
            double salesTotal = 15000.0; // Example sales total
            double commissionRate = 0.0;

            if (salesTotal > 10000.0) {
                commissionRate = 0.05; // 5% commission
            }

            double commissionAmount = salesTotal * commissionRate;
            System.out.println("Commission Rate: " + commissionRate);
            System.out.println("Commission Amount: " + commissionAmount);
        }
    }

