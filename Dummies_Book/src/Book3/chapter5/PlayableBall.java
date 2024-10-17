package Book3.chapter5;

// Interface representing a ball that can be thrown, kicked, and dropped
public interface PlayableBall extends ThrowableBall, KickableBall {
    // Method to simulate dropping the ball
    void dropBall();

    // Method to print details about the playable ball
    void print();
}

