package Book4.chapter2;

import java.util.Scanner;

public class Players {
    private String name;
    private String[] players;

    // Constructor to initialize the players array
    public Players(int count) {
        players = new String[count]; // Initialize the array with the specified count
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        for (int i = 0; i < count; i++) {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine(); // Read player name from input
        }
        sc.close(); // Close the scanner
    }

    // Method to display the player names
    public void displayPlayers() {
        System.out.println("Player names:");
        for (String player : players) {
            System.out.println(player);
        }
    }

    public static void main(String[] args) {
        // Define how many players to input
        int count = 3; // Example: getting names for 3 players
        Players playersObj = new Players(count); // Create a Players object
        playersObj.displayPlayers(); // Display the entered player names
    }
}
