package BasicCodes;

import java.util.Scanner;

public class palindromNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No. To check : ");
        int num = scan.nextInt();

        int original_num = num;  // store value in temp variable

        int rev = 0; // assign new variable

        // using while condition
        while(num > 0) {
            rev = (rev*10) + num%10;
            num = num/10;
        }
        // using if-Else condition
        if(original_num == rev) {
            System.out.println("*palindrom number*");
        } else {
            System.out.println("*Not palindrom number*");
        }

    }
}
