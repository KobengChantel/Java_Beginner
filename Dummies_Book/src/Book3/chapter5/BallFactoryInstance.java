package Book3.chapter5;
//one common use for abstract classes is to provide a way to obtain an instance of one
//of several subclasses when you don’t know which subclass you need in advance. To do
//this, you can create an Abstract Factory class that has one or more methods that return
//subclasses of the abstract class



public class BallFactoryInstance {
    public static Ball getBall(String t) {
        if (t.equalsIgnoreCase("BaseBall"))
            return new BaseBall();
        if (t.equalsIgnoreCase("SoftBall"))
            return new SoftBall();

        return null;
    }
}

