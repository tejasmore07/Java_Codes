package BasicCodes;

import java.util.Scanner;

public class powerCalculate {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("enter a number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println("enter a power: ");
        p = scan.nextInt();

        for(int i = 1; i<= p; i++) {
            result = n * result;
        }
        System.out.println(result);
    }
}
