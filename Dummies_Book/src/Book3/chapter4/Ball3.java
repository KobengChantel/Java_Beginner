package Book3.chapter4;

//you can explicitly call a base class constructor from a subclass by
//using the super keyword. Because Java automatically calls the default construc-
//tor for you, the only reason to do this is to call a constructor of the base class that
//uses a parameter. Here’s a version of the Ball and BaseBall classes in which the
//BaseBall constructor calls a Ball constructor that uses a parameter:
public class Ball3 {
    private double weight;

    // Constructor with weight parameter
    public Ball3(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

