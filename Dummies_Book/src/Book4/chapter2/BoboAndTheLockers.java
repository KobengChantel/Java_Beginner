package Book4.chapter2;
//LISTING 2.1
public class BoboAndTheLockers {
    public static void main(String[] args) {
// true = open; false = closed
        boolean[] lockers = new boolean[1001];
// close all the lockers
        for (int i = 1; i <= 1000; i++)
        lockers[i] = false;
        for (int skip = 1; skip <= 1000; skip++)
        {
            System.out.println("Bobo is changing every "
                    + skip + " lockers.");
            for (int locker = skip; locker < 1000;
            locker += skip)
            lockers[locker] = !lockers[locker];
        }
        System.out.println("Bobo is bored"
                + " now so he's going home.");
// count and list the open lockers
        String list = "";
        int openCount = 0;
        for (int i = 1; i <= 1000; i++)
        if (lockers[i]) {
            openCount++;
            list += i + " ";
        }
        System.out.println("Bobo left " + openCount
                + " lockers open.");
        System.out.println("The open lockers are: "
                + list);
    }
}