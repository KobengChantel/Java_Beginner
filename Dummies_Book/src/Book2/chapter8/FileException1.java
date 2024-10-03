package Book2.chapter8;


//program that uses a class called FileInputStream. To create an object
//from this class, you must pass the constructor a string that contains the path
//and name of a file that exists on your computer. If the file can’t be found, the
//FileInputStream throws a FileNotFoundException that you must either catch
//or throw. This class is in the java.io package, so any program that uses it must
//include an import java.io statement

//import java.io.*;
//public class FileException1 {
//    public static void main(String[] args)
//    {
//        openFile("C:\test.txt");
//    }
//    public static void openFile(String name) {
//        FileInputStream f = new FileInputStream(name);
//    }
//    }

    //catching FileNotFoundException

import java.io.*;
//public class FileException2
public class FileException1
{
    public static void main(String[] args)
    {
        openFile("C:\test.txt");
    }
    public static void openFile(String name)
    {
        try {
            FileInputStream f =
                    new FileInputStream(name);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}