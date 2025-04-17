package chapter14.Lesson14;

public class Utils {
    public static void main(String[] args) {
        Utils util = new Utils();
        util.doThis();
    }
    //with try-catch block no need to type throws exception after
    public void doThis(){
        try{
            doThis();
        }catch(Exception e){
            System.out.println("doThis * \nException caught: + e.getMessage");
        }
//        System.out.println("Arrivedin doThis");
//        System.out.println("Back in doThis");
    }
    //no try-catch block
    public void doThat() throws Exception{
        System.out.println("In doThat: Printing exception");
        throw new Exception("Duch!");
    }
}
