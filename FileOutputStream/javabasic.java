package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class javabasic {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Tejas\\Desktop\\java basic.txt");
            int i = fr.read();

            while (i != -1) {
                System.out.print((char)i);
                i = fr.read();
            }
            fr.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
