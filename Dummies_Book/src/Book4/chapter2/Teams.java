package Book4.chapter2;
//using jagged arrays
// create an array with an expression such as new int[5][3], you’re
//specifying that each element of the main array is actually an array of type int with
//three elements

public class Teams {
    public static void main(String[] args) {
        String[][] teams = {
                {"Henry Blake", "Johnny Mulcahy"},
                {"Benjamin Pierce", "John McIntyre", "Jonathan Tuttle"},
                {"Margaret Houlihan", "Frank Burns"},
                {"Max Klinger", "Radar O'Reilly", "Igor Straminsky"}
        };

        // First way: Using traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.println(teams[i][j]);
            }
            System.out.println(); // Print an empty line between teams
        }

        // Second way: Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String[] team : teams) {
            for (String player : team) {
                System.out.println(player);
            }
            System.out.println(); // Print an empty line between teams
        }
    }
}
