package Book3.chapter8;

//WORKING WITH PACKAGES
//package is a group of classes that belong together. Without packages, the entire
//universe of Java classes would be a huge, unorganized mess
// Packages let you organize this mass into smaller, manageable collec-
//tions of related classes
//import statement can import all the classes in a package by using an asterisk
//wildcard


//package com.lowewriter.util;
import java.util.Scanner;
public class Console {
    static Scanner sc = new Scanner(System.in);

    public static boolean askYorN(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt
                    + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }
    }
}
