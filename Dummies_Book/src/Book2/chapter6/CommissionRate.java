package Book2.chapter6;

//set a commission rate based on a sales
//class represented by an integer (1, 2, or 3) according to this table:

//

//Class Commission Rate
//1 2%
//2 3.5%
//3 5%
//Any other value 0%

//public class CommissionRate {
//
//    // Method to calculate commission based on sales class
//    public double getCommissionRate(int salesClass) {

//        double commissionRate;
//        switch (salesClass) {
//            case 1:
//                commissionRate = 0.02;
//                break;
//            case 2:
//                commissionRate = 0.035;
//                break;
//            case 3:
//                commissionRate = 0.05;
//                break;
//            default:
//                commissionRate = 0.0;
//                break;
//        }
//        return commissionRate;
//    }
//}


//Class Sales < $10,000 Sales $10,000 and Above
//1 1% 2%
//2 2.5% 3.5%
//3 4% 5%
//Any other value 0% 0%

// using the if statement
//public class CommissionRate {
//
//    // Method to calculate commission based on sales class and sales total
//    public double getCommissionRate(int salesClass, double salesTotal) {
//        double commissionRate;
//        switch (salesClass) {
//            case 1:
//                if (salesTotal < 10000.0)
//                    commissionRate = 0.01;
//                else
//                    commissionRate = 0.02;
//                break;
//            case 2:
//                if (salesTotal < 10000.0)
//                    commissionRate = 0.025;
//                else
//                    commissionRate = 0.035;
//                break;
//            case 3:
//                if (salesTotal < 10000.0)
//                    commissionRate = 0.04;
//                else
//                    commissionRate = 0.05;
//                break;
//            default:
//                commissionRate = 0.0;
//                break;
//        }
//        return commissionRate;
//    }
//}

//Class Commission Rate
//A or a 2%
//B or b 3.5%
//C or c 5%
//Any other value 0%

public class CommissionRate {

    // Method to calculate commission based on sales class
    public double getCommissionRate(char salesClass) {
        double commissionRate;
        switch (salesClass) {
            case 'A':
            case 'a':
                commissionRate = 0.02;
                break;
            case 'B':
            case 'b':
                commissionRate = 0.035;
                break;
            case 'C':
            case 'c':
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        return commissionRate;
    }
}
