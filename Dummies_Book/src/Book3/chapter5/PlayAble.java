package Book3.chapter5;



public interface PlayAble {
    void play();
}


//the Playable interface specifies that if an implementing class does not pro-
//vide an implementation of the quit method, the default method will be used. In
//this case, the default method simply prints the message "Sorry, quitting is
//not allowed."
//interface Playable
//{
//    void play();
//    default void quit()
//    {
//        System.out.println("Sorry, quitting is not allowed.");
//    }
//}