package CAPGQ;

import java.util.Scanner;

public class CarKM {
    public static void main(String[] args) {
        int n, ans = 1, r;
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        while (n>0 && n<=32767) {
            r = n % 10;
            ans = r * ans;
            n = n / 10;
        }
        if (n<0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(ans);
        }
    }
}



