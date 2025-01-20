public class PrintDayOfWeek1 {
    public void printDayOfWeek(int day) {
        // Correctly format the switch expression
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.print(result);
    }

    public static void main(String[] args) {
        PrintDayOfWeek1 dayPrinter = new PrintDayOfWeek1();
        dayPrinter.printDayOfWeek(3); // Example usage
    }
}
