
//Exercise 4-1:
package Chapter4.ex04_1_exercise;
//        1.  Declare and initialize 2 String variables: custName and itemDesc
//2.  Declare a String variable called message.  Do not initialize it.
//        3.  Assign the message variable with a concatenation of the custName and itemDesc.
//Include a String literal that results in a complete sentence.
//        (example: "Mary Smith wants to purchase a Shirt")
//        4.  Print the message to the System output.
//5.  Run the code.


public class ShoppingCart {
    public static void main(String[]args){
       // declaring
        String custName = "MmaSetshaba MoThusi Aliyaah";
        String itemDesc = "Cap";
        String message;
        // assigning variable
       message = custName + " " + " wants to purchase or buy a " + itemDesc;
    //printing the message
        System.out.println(message);
        //System.out.println(message);
    }
}
