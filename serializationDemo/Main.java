package serializationDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        serialization s1 = new serialization();
        s1.name = "prasanna";
        s1.age=50;
        s1.address = "kanchanwadi";
        s1.id=0101;

        try{
            FileOutputStream fout = new FileOutputStream("D:\\Study video\\java practice\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.close();
            fout.close();
            System.out.println("Serialization data is saved....");
        }
        catch(IOException e) {
            System.out.println(e);

        }
    }
}
