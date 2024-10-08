package Book3.chapter4;
//When you
//inherit a class, all the public members of the superclass are available to the sub-
//class, but the private members aren’t. They do become part of the derived class,
//but you can’t access them directly in the derived clas



//Java provides a third visibility option that’s useful when you create subclasses:
//protected. A member with protected visibility is available to subclasses but not
//to other classes. Consider this example

public class Ball1 {
    private double weight;

    protected double getWeight() {
        return this.weight;
   }

    protected void setWeight(double weight) {
       this.weight = weight;
    }
}


