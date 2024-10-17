package Book3.chapter5;
//INTERFACES
//Interface fields are used to provide constant values that are related to the
//interface
//extend interfaces by using the extends keyword. An interface that extends
//an existing interface is called a subinterface, and the interface being extended is
//called the superinterface
/// Interface representing a ball that can be thrown and caught
public interface ThrowableBall {
    // Method to simulate throwing the ball
    void throwBall();

    // Method to simulate catching the ball
    void catchBall();

    // Method to print details about the throwable ball
    void print();
}
