public class Zoo {
     public static void pause() {                 // Defines the thread task
               try {
                     Thread.sleep(10_000);                  // Wait for 10 seconds
                   } catch (InterruptedException e) {}

        System.out.println("Thread finished!");
            }

            public static void main(String[] unused) {
             var job = new Thread(() - > pause());      // Create thread

            job.start();                              // Start thread

        System.out.println("Main method finished!");
         } }