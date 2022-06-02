package BasicCodes;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b=0,sum=0;
        System.out.println("Enter number : ");
        a = scan.nextInt();
        System.out.println(a);

        for(int i = 0; i<5; i++) {
            b = a % 10;
            sum = sum + b;
            a = a / 10;

        }
        System.out.println("sum is : " + sum);

    }
}
