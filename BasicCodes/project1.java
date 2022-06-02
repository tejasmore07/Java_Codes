package BasicCodes;

import java.util.Scanner;


public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int UserNumber = 0;

        do {
            System.out.println(" Guess the Number(1 - 100) : ");
            UserNumber = sc.nextInt();

            if (UserNumber == myNumber) {
                System.out.println("Sahi Jawab");
                break;
            } else if (UserNumber > myNumber) {
                System.out.println("Thoda km kr");
            } else {
                System.out.println("Thoda bada kr");
            }
        }

            while (UserNumber >= 0);

                System.out.print("Yeh tha : ");
                System.out.println(myNumber);


        }

    }
