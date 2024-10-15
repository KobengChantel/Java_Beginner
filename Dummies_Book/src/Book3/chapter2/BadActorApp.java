package Book3.chapter2;


import Book3.chapter2.Actor; // Import the Actor class

public class BadActorApp {
    public static void main(String[] args) {
        Actor a = new Actor("Doe", "John"); // Create an Actor instance

        // Use getter methods to access the private fields
        System.out.println("Actor created: " + a.getFirstName() + " " + a.getLastName());
    }
}




