package ExceptionHandling;

import java.util.Scanner;

public class TryCatchDemo {
    public void try_catch() {
        System.out.println("enter 2 value");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = a/b;
        System.out.println("value " + c);

    }
}
