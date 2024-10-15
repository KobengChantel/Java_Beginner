package Book3.chapter2;

public class DiceName {
    public static void main(String[] args) {
        Dice d = new Dice();
        d.roll(); // Calls the roll method to simulate rolling the dice
    }
}

class Dice {
    // Method to simulate rolling a six-sided dice
    public void roll() {
        int result = (int)(Math.random() * 6) + 1; // Generates a random number between 1 and 6
        System.out.println("You rolled a " + result + "!");
    }
}
