package BasicCodes;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            scanner.close();
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else if (n % 2 == 0 && (n <= 5 || n >= 2)) {
                System.out.println("Not weird");

            } else if (n % 2 == 0 && (n <= 20 || n >= 6)) {
                System.out.println("Wierd");

            } else if (n % 2 == 0 && (n >= 20 || n <= 100)) {
                System.out.println("Not wierd");

            }

        }
    }


