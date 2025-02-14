//corrected version of the SheepManager class that orders the workers:
       import java.util.concurrent.*;
         public class SheepManager {
     private int sheepCount = 0;
   private void incrementAndReport() {
        synchronized(this) {
                     System.out.print((++sheepCount)+" ");
                   }
            }
      public static void main(String[] args) {
            ExecutorService service = Executors.newFixedThreadPool(20);
        try {
                    var manager = new SheepManager();
                   for(int i = 0; i < 10; i++)
                            service.submit(() - > manager.incrementAndReport());
                  } finally {
                     service.shutdown();
               } } }