package Chapter5;

public class Lesson5 {
    public static void main(String[] args) {
            /**int attendees = 5;
             boolean largeVenue;

             if(attendees >= 5){
             largeVenue = true;
             System.out.println("Large venue needed!");
             }
             else{
             largeVenue = false;
             System.out.println("Large venue not needed!");
             }

             largeVenue = (attendees > 5);**/

            /**String itemDesc1 = "Shirt";
             String itemDesc2 = "Trousers";
             String itemDesc3 = "Scarf";

             String[] items = new String[] {"Shirt", "Trousers", "Scarf"};

             for (String item : items) {
             System.out.println(item);
             };**/

            /**String[] names = new String[] {"George","Jill", "Xinyi", "Ravi"};

             for (String name : names) {
             System.out.println("Name is " + name);
             }**/

            int passmark = 12;
             boolean passed = false;
             int[] scores = {4,6,2,8,12,35,9};

             for(int unitScore: scores) {
             if (unitScore >= 12){
             passed = true;
             break;
             }
             }
             System.out.println("At least one passed? " + passed);

        }
    }
