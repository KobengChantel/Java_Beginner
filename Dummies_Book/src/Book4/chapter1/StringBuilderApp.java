package Book4.chapter1;

import java.util.Scanner;
public class StringBuilderApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'A') || (c == 'a')
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')

                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                sb.setCharAt(i, '*');
            }
        }
        System.out.println();
        System.out.println(s);
        System.out.println(sb.toString());
    }
}