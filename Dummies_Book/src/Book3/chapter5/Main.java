package Book3.chapter5;

// Main class to test the implementation of the interfaces and classes
public class Main {
    public static void main(String[] args) {
        PlayableBall soccerBall = new SoccerBall("Red");

        soccerBall.throwBall();
        soccerBall.kickBall();
        soccerBall.catchBall();
        soccerBall.dropBall();
        soccerBall.print(); // This will print the color of the soccer ball
    }
}
