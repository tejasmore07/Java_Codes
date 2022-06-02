package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
    public void try_catch4() {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number ");
            int arr[] = new int[5];
            try{
                arr[6] = scan.nextInt();
                System.out.println(arr[6]);
            }
            catch (InputMismatchException e) {
                System.out.println("Don't enter String value");
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Don't enter additional value");
            System.out.println(e.getMessage());
        }
    }
}
