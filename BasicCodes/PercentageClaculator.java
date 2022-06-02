package BasicCodes;

import java.util.Scanner;

public class PercentageClaculator {
    public static void  main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your physics marks");
        int physics= scan.nextInt();
        System.out.println("Enter your math marks");
        int math= scan.nextInt();
        System.out.println("Enter your geography marks");
        int geography= scan.nextInt();
        System.out.println("Enter your english marks");
        int english= scan.nextInt();
        System.out.println("Enter your science marks");
        int science= scan.nextInt();
        int percentage=(physics + math + geography + english + science);
        System.out.println("percentage : " + (percentage  / 500.0f) * 100);


    }
}
