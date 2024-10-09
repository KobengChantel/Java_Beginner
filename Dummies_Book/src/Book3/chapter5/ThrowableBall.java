package Book3.chapter5;


//Extending interfaces
//You can extend interfaces by using the extends keyword. An interface that extends
//an existing interface is called a subinterface, and the interface being extended is
//called the superinterface.

//extends keyword with interfaces, all the fields and methods of
//the superinterface are effectively copied into the subinterface. Thus the subinter-
//face consists of a combination of the fields and methods in the superinterface plus
//the fields and methods defined for the subinterface

public interface ThrowableBall {
    void throwBall();

    void catchBall();
}
