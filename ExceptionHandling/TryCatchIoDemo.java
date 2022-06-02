package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchIoDemo {
    public void try_catch3() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter values : ");
            int a = scan.nextInt();
            int a1 = scan.nextInt();
            int a2 = scan.nextInt();
            int a3 = scan.nextInt();
            System.out.println(a+a1+a2+a3);
        }
        catch (InputMismatchException e) {
            System.out.println("Enter only integer value");
            System.out.println("~Again enter input~");
        }
        try {
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                int a1 = scan.nextInt();
                int a2 = scan.nextInt();
                int a3 = scan.nextInt();
                System.out.println("Addition is " + (a+a1+a2+a3));
            }
            catch(InputMismatchException e){
            System.out.println("Enter integer value");

            }


    }
}
