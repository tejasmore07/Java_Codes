package JavaExecutors;

import java.util.Calendar;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[]args) {
        System.out.println("A count down program");
        // Creating a Scheduled Executor Service
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(20);
        // Printing the current time
        System.out.println("Current Time:" + Calendar.getInstance().get(Calendar.SECOND));
        // Scheduling the tasks
        for (int i = 10; i > 0; i--) {
            scheduler.schedule(new Task$(i), 10 - i, TimeUnit.SECONDS);
        }
        scheduler.shutdown();
    }
}
class Task$ implements Runnable {
    private final int num;
    public Task$(int num){
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println("Number" + "Current time : " + Calendar.getInstance().get(Calendar.SECOND));
    }
}
