package Book3.chapter5;

//USING INTERFACES
//interface is similar to an abstract class, but an interface can include only
//abstract methods and final fields (constants), and an interface can’t be used as
//a base class. A class implements an interface by providing code for each method
//declared by the interface


// extend interfaces by using the extends keyword. An interface that extends
//an existing interface is called a subinterface, and the interface being extended is
//called the superinterface


// Interface for Dealable (for dealing cards)
public interface Dealable {
    void deal(int numberOfCards);
}

//go to deck.java
