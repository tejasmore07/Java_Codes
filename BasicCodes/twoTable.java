package BasicCodes;
import java.util.Scanner;
public class twoTable {
    public static void  main(String[] args) {
        int n,b,sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your n Value: ");
        n = scan.nextInt();
        for(int i=1; i <= 10; i++) {
            b = n*i;
            sum = sum+b;
            System.out.println(n + " x " + i + " = " + (b));}
        System.out.println("The sum is : " + sum);
    }
}
