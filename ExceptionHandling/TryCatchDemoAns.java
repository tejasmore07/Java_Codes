package ExceptionHandling;

import java.util.Scanner;

public class TryCatchDemoAns {
    public void try_catch1 () {
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a/b;
            System.out.println("Value " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Dont use zero value");
        }
    }
    public void try_catch2() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        System.out.println("Value " + c);

    }
}
