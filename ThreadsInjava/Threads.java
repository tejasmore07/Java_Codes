package ThreadsInjava;

public class Threads {
    public static class Multi implements Runnable {
        public void run() {
            System.out.println("Thread is Running....");
        }
    }
    public static void main(String[] args) {
        Multi m1 = new Multi();
        Thread t = new Thread(m1);
        t.start();
//        m1.run();
    }


}
