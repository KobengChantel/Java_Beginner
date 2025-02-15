// Polling with Sleep

public class CheckResultsWithSleep {
    private static volatile int counter = 0; // Ensure visibility across threads

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        });
        t.start();

        while (counter < 1_000_000) {
            try {
                Thread.sleep(1000); // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }

        System.out.println("Reached: " + counter);
    }
}
