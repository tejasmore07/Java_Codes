package CAPGQ;

import java.util.Scanner;

public class PrimeLarger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == b) {
            System.out.println(0);
        } else {
            if (a % 2 == 0 && b % 2 == 0) {
                System.out.println(Math.min(a, b));
            } else {
                System.out.println(Math.max(a, b));
            }
        }
    }
}
