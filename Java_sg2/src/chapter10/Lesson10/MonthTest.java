package chapter10.Lesson10;

public class MonthTest {
//    public class MonthTest {
        public static void main(String[] args) {
            //**************************************NESTED IF STATEMENT***********************************************
//        int month = 8;
//        boolean isLeapYear = true;
//
//        if (month == 1 || month == 3 || month == 5 || month == 7
//                || month == 8 || month == 12) {
//            System.out.println("31 days in the month");
//        } else if (month == 2) {
//            if (isLeapYear) {
//                System.out.println("29 days in the month");
//            } else {
//                System.out.println("28 days in the month");
//            }
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println("30 days in the month");
//        } else {
//            System.out.println("Invalid month");
//        }

            //**************************************SWITCH AND CASE************************************************
            int month = 12;
            boolean isLeapYear = true;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 12:
                    System.out.println("31 days in the month");
                    break;
                case 2:
                    if (isLeapYear) {
                        System.out.println("29 days in the month");
                    } else {
                        System.out.println("28 days in the month");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days in the month");
                    break;
                default:
                    System.out.println("Invalid month");
            }
        }
    }