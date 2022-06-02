package BasicCodes;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        int m,n, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        m = scan.nextInt();
        n = scan.nextInt();

        for(int i = m; i< n; i++) {
            if((i%3 == 0)  && (i%5 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
