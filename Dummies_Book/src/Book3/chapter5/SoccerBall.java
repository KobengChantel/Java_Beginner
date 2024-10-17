package Book3.chapter5;

// Class representing a soccer ball, implementing KickableBall and ThrowableBall
public class SoccerBall implements PlayableBall {
    private String color;

    public SoccerBall(String color) {
        this.color = color;
    }

    @Override
    public void throwBall() {
        System.out.println("Throwing the soccer ball.");
    }

    @Override
    public void catchBall() {
        System.out.println("Catching the soccer ball.");
    }

    @Override
    public void kickBall() {
        System.out.println("Kicking the soccer ball.");
    }

    @Override
    public void dropBall() {
        System.out.println("Dropping the soccer ball.");
    }

    @Override
    public void print() {
        System.out.println("Soccer Ball Color: " + color);
    }
}
