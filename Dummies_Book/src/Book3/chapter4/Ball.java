package Book3.chapter4;

//f you need to refer to a field or method that belongs to a base class? To
//do that, you use the super keyword. It works similarly to this but refers to the
//instance of the base class rather than the instance of the current class


//this keyword: It provides a way to refer to the cur-
//rent object instance. It’s often used to distinguish between a local variable or a
//parameter and a class field with the same name.

public class Ball {
    public void hit() {
        System.out.println("You hit it a mile!");
    }
}

class BaseBall extends Ball {
    @Override
    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();  // Call the superclass's hit method
    }

    public static void main(String[] args) {
        BaseBall baseball = new BaseBall();
        baseball.hit();
    }
}

