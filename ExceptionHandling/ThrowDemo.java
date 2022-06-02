package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
    public void trythrowcatch() {
        try {
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();
            if (age < 18)
            {
                throw new ArithmeticException("not eligible for voting");
            }
            else
            {
                System.out.println("eligible for voting");
            }
        }
            catch (ArithmeticException e)
            {
                System.out.println("Try again");
                throw e;
            }
     }
}
