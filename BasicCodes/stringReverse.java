package BasicCodes;

import java.util.Scanner;

public class stringReverse {
    public static void  main(String[] args) {
        System.out.println("enter any string which want to reverse");

        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();


        //String in = "tejas more";
        StringBuilder input = new StringBuilder(in);
//        input.append(in);
        input.reverse();
        System.out.println(input);

        String a;
        a= scan.nextLine();

        for(int i=a.length()-1;i>=0;i--) {
            System.out.print(a.charAt(i));
        }






    }
}
