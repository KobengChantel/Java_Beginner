
package chapter11.practice1.utility;

import chapter11.practice1.soccer.*;

import java.util.Arrays;


public class GameUtils {



        // Method to randomly add goals to the current game
        public static void addGameGoals(Game currGame) {

            // Check if the goals array is not initialized, and initialize with random size if necessary
            if (currGame.getGoals() == null) {
                currGame.setGoals(new Goal[(int) (Math.random() * 10)]);   // Initialize with up to 9 goals
            }

            // Initialize a counter for the goals array index
            int i = 0;
            // Iterate over the goals array to create and assign each Goal object
            for (Goal currGoal : currGame.getGoals()) {
                // Create a new Goal object
                currGoal = new Goal();

                // Randomly assign the goal to either the home team or the away team
                currGoal.setTheTeam(Math.random() > 0.5 ? currGame.getHomeTeam() : currGame.getAwayTeam());

                // Randomly select a player from the assigned team to score the goal
                currGoal.setThePlayer(currGoal.getTheTeam().getPlayerArray()[(int) (Math.random() * currGoal.getTheTeam().getPlayerArray().length)]);

                // Set a random time (in minutes) for when the goal was scored
                currGoal.setTheTime((int) (Math.random() * 90));

                // Assign the Goal object to the goals array in the current game
                currGame.getGoals()[i] = currGoal;
                i++;
            }

            // Sort the goals array by the time of each goal in ascending order
            Arrays.sort(currGame.getGoals(), (g1, g2) -> Double.valueOf(g1.getTheTime()).compareTo(Double.valueOf(g2.getTheTime())));
        }
    }

