package Book2.chapter2;

//A Class That Demonstrates Shadowinp

//LISTING2:2

public class ShadowApp {

    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " +
                ShadowApp.x);

    }
}
