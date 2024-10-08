package Book3.chapter4;

//ou create an instance of a subclass, Java automatically calls the default
//constructor of the base class before it executes the subclass constructor.

    public class BaseBall2 extends Ball {
        @Override
        public void hit() {
            System.out.println("You tore the cover off!");
            super.hit();
        }

        public static void main(String[] args) {
            BaseBall2 baseball2 = new BaseBall2();
            baseball2.hit();
        }
    }


