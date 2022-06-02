package JavaExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    public void run() {
        try {
            Long duration = (long) (Math.random() * 5);
            System.out.println("Running Task!");
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();

        try {
            es.submit(new Task());
            System.out.println("Shutdown executor");
            es.shutdown();

            es.awaitTermination(10, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            System.err.println("Tasks Interrupted ...");
        } finally {
            if (!es.isTerminated()) {
                System.err.println("Cancel non-finished tasks ..");
            }
            es.shutdownNow();
            System.out.println("Shutdown is Finished..");
        }
    }
}