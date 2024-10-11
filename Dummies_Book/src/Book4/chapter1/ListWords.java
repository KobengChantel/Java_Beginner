package Book4.chapter1;

import java.util.Scanner;
public class ListWords {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args)
//    {
//        System.out.print("Enter a string: ");
//        String s = sc.nextLine();
//        String[] word = s.split("\\s+");
//        for (String w : word)
//            System.out.println(w);
//    }
//}

//can use the replaceFirst or replaceAll method to replace a part of a string
//that matches a pattern you supply with some other text
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.replaceAll("cat", "dog");
        System.out.println(s);
    }
}