package BasicCodes;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Year To Check: ");
        y = scan.nextInt();

        if((y%100 == 0) && (y%400 == 0) || (y%100 != 0) && (y%4 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not A Leap Year");
        }

    }
}
