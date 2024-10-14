package Book2.chapter4;


    import java.util.Scanner;

    public class test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (askYorN(scanner, "Keep going? (y/n)")) {
                System.out.println("D'oh!");
            }

            scanner.close();
        }

        private static boolean askYorN(Scanner scanner, String question) {
            System.out.print(question);
            String response = scanner.nextLine().trim().toLowerCase();
            return response.equals("y") || response.equals("yes");
        }
    }
