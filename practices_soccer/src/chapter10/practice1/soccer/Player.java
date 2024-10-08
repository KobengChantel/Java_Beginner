

package chapter10.practice1.soccer;


public class Player {

    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player() {
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
