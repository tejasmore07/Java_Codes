package serializationDemo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        serialization s1 = null;
        try{
            FileInputStream fin = new FileInputStream("D:\\Study video\\java practice\\employee.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            s1 = (serialization) in.readObject();
            in.close();
            fin.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
            return;
        }
        s1.display();
    }
}
