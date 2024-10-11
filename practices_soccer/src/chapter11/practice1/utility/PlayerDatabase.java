

package chapter11.practice1.utility;

import chapter11.practice1.soccer.Player;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class PlayerDatabase {

    // List to store Player objects
    private ArrayList<Player> players;

    // Constructor that initializes the players list from the authorList string
    public PlayerDatabase() {
        // Split the authorList string by commas to get each author's name
        StringTokenizer authorTokens = new StringTokenizer(authorList, ",");
        players = new ArrayList();
        // Loop through each token and create a Player object
        while (authorTokens.hasMoreTokens()) {
            players.add(new Player(authorTokens.nextToken()));
        }
    }

    // Method to return an array of randomly selected players
    public Player[] getTeam(int numberOfPlayers) {
        Player[] teamPlayers = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            // Randomly select an index within the range of the players list
            int playerIndex = (int) (Math.random() * players.size());
            // Add the randomly selected player to the team array
            teamPlayers[i] = players.get(playerIndex);
            // Remove the selected player from the list to avoid duplicates
            players.remove(playerIndex);
        }
        return teamPlayers;
    }

    // String containing a list of author names separated by commas
    String authorList =
            "Agatha Christie," +
                    "Alan Patton," +
                    "Alexander Solzhenitsyn," +
                    "Arthur Conan Doyle," +
                    "Anthony Trollope," +
                    "Baroness Orczy," +
                    "Brendan Behan," +
                    "Brian Moore," +
                    "Boris Pasternik," +
                    "Charles Dickens," +
                    "Charlotte Bronte," +
                    "Dorothy Parker," +
                    "Emile Zola," +
                    "Frank O'Connor," +
                    "Geoffrey Chaucer," +
                    "George Eliot," +
                    "G. K. Chesterton," +
                    "Graham Green," +
                    "Henry James," +
                    "James Joyce," +
                    "J. M. Synge," +
                    "J. R. Tolkien," +
                    "Jane Austin," +
                    "Leo Tolstoy," +
                    "Liam O'Flaherty," +
                    "Marcel Proust," +
                    "Mark Twain," +
                    "Oscar Wilde," +
                    "O. Henry," +
                    "Samuel Beckett," +
                    "Sean O'Casey," +
                    "William Shakespeare," +
                    "William Makepeace Thackeray," +
                    "W. B. Yeats," +
                    "Wilkie Collins";
}
