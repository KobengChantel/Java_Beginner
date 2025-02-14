//choosing a thread pool size so that all tasks can be run
//concurrently


import java.util.concurrent.*;
   public class SheepManager {
    private int sheepCount = 0;
      private void incrementAndReport() {
                System.out.print((++sheepCount)+" ");
           }
      public static void main(String[] args) {
               ExecutorService service = Executors.newFixedThreadPool(20);
                try {
                     SheepManager manager = new SheepManager();
                      for(int i = 0; i < 10; i++)
                           service.submit(() - > manager.incrementAndReport());
                   } finally {
                      service.shutdown();
                   } } }
