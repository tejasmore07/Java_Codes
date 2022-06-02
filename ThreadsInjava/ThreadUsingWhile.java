package ThreadsInjava;

public class ThreadUsingWhile extends Thread {
    String msg=" ";
    void Thread(String msg) {
        this.msg = msg;
    }
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println(msg);
                Thread.sleep(100);
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }
}