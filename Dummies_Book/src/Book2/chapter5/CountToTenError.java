package Book2.chapter5;

public class CountToTenError {

    //declare the counter variable in the initialization statement, the scope of
//the counter variable is limited to the for statement itself. Thus, you can use the
//variable in the other expressions that appear within the parentheses and in the
//body of the loop, but you can’t use it outside the loop.

    //because the last statement in the main method refers to the variable i,
    //which has gone out of scope because it was declared within the for loop

//    public static void main(String[] args)
//    {
//        for (int i = 1; i <=10; i++)
//            System.out.println(i);
//        System.out.println("The final value of i is " +
//                i);
//    }
//}

//COUNTTOTENERRORFIXED

    //because the i variable is declared before the for statement, the ini-
    //tialization expression doesn’t name the variable’s data type.

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++)
            System.out.println(i);
        System.out.println("The final value of i is " +
                i);
    }
}

