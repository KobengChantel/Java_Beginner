package Book3.chapter8;


//package com.lowewriter.util;

import java.util.Scanner;

    public class Console1 {
        private static Scanner scanner = new Scanner(System.in);

        /**
         * Prompts the user with a Yes/No question.
         * @param question The question to ask the user.
         * @return true if the user answers 'Y' or 'y', false if 'N' or 'n'.
         */
        public static boolean askYorN(String question) {
            String input;
            while (true) {
                System.out.print(question + " (Y/N): ");
                input = scanner.nextLine().trim().toLowerCase();

                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            }
        }

        /**
         * Closes the scanner resource.
         */
        public static void close() {
            scanner.close();
        }
    }

