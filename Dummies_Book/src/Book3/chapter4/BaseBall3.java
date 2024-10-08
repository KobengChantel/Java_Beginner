package Book3.chapter4;
//you can explicitly call a base class constructor from a subclass by
//using the super keyword. Because Java automatically calls the default construc-
//tor for you, the only reason to do this is to call a constructor of the base class that
//uses a parameter. Here’s a version of the Ball and BaseBall classes in which the
//BaseBall constructor calls a Ball constructor that uses a parameter:
public class BaseBall3 {

        public class BaseBall extends Ball3 {
            public BaseBall() {
                super(5.125); // Calls the Ball constructor with weight 5.125
            }

            public void displayWeight() {
                System.out.println("Weight of the baseball: " + getWeight());
            }
        }

        public static void main(String[] args) {
            BaseBall3 outer = new BaseBall3();
            BaseBall3.BaseBall baseball = outer.new BaseBall();
            baseball.displayWeight();
        }
    }


