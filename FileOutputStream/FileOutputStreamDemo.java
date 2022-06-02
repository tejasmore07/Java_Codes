package FileOutputStream;
import java.io.FileOutputStream;


public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\testdemo.txt");
            String s = "Welcome\ntejas more";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Success...");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
