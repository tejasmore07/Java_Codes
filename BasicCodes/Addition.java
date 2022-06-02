package BasicCodes;

import java.util.Scanner;

public class Addition {
    public static void main(String[]  args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a :");
        a = scan.nextInt();
        System.out.println("Enter b :");
        b = scan.nextInt();
        int c = a + b;
        System.out.println("sum is : " + c);
    }
}
