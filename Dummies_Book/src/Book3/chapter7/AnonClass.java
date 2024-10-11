package Book3.chapter7;
//USING ANONYMOUS INNER CLASS
//Anonymous inner classes (usually just called anonymous classes) are probably the
//strangest feature of the Java programming language

//CREATING AN ANONYMOUS CLASS
//new ClassOrInterface() { class-body }
public class AnonClass {
    public static void main(String[] args)
    {
        Ball b = new Ball()
        {
            public void hit()
            {
                System.out.println("You hit it!");
            }
        };
        b.hit();
    }
    interface Ball
    {
        void hit();
    }
}
