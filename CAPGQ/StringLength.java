package CAPGQ;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        String a, b;
        int c, d;

        Scanner scan = new Scanner(System.in);
        a = scan.next();
        b = scan.next();
            c = a.length();
            d = b.length();
        System.out.println(c + d);

    }
}
