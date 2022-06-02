package BasicCodes;

import java.util.Scanner;

public class Reverse {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any string which want to reverse");
        String in = scan.nextLine();
        System.out.println("original name is : " +  in);
        System.out.print("After Reverse name is : ");




        char[] CharArray = in.toCharArray();

        for(int i = CharArray.length-1 ; i>=0;i--) {
            System.out.print(CharArray[i]);

        }
        System.out.println();

        /*if(in.equals(CharArray)) {
            System.out.println("String is palindrom");

        } else {
            System.out.println("not a palimdron");
        }*/


    }
}
