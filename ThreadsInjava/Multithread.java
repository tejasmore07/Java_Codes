package ThreadsInjava;

class MultiThreading implements Runnable {
    public void run() {
        try {
            System.out.println("Threads " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
public class Multithread {
    public static void main(String[] args) {
        int n = 5;
            for (int i = 0; i < n; i++) {
                Thread object = new Thread(new MultiThreading());
                object.start();
            }
        }
    }
