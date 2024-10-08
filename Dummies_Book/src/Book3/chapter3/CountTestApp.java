package Book3.chapter3;

//Listing 3-1. This program includes two classes. The CountTest class is a simple
//class that keeps track of how many times its constructor has been called. Then the
//CountTestApp class uses a for loop to create 10 instances of the class, displaying
//the number of instances that have been created after it creates each instance


//he instance count in this application is reset to zero each time the
//application is run. As a result, it doesn’t keep track of how many instances of the
//CountTest class have ever been created — only of how many have been created
//during a particular execution of the program

public class CountTestApp {

    public static void main(String[] args)
    {
        printCount();
        for (int i = 0; i < 10; i++)
        {
            CountTest c1 = new CountTest();
            printCount();
        }
    }
    private static void printCount()
    {
        System.out.println("There are now "
                + CountTest.getInstanceCount()
                + " instances of the CountTest class.");
    }
}
class CountTest
        {
private static int instanceCount = 0;
public CountTest()
        {
instanceCount++;
        }
public static int getInstanceCount()
        {
        return instanceCount;


}
}
