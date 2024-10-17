package Book3.chapter5;
//Using default methods
// uses the Playable interface and its default
//method
// interfaces are an incredibly useful feature of Java, they have an inherent
//limitation

    public class TestLambdaCollection
    {
        public static void main(String[] args)
        {
            Game g = new Game();
            g.play();
            g.quit();
        }
    }
    interface Playable
    {
        void play();
        default void quit()

        {
            System.out.println("Sorry, quitting is not allowed.");
        }
    }
class Game implements Playable
{
    public void play()
    {
        System.out.println("Good luck!");
    }
}