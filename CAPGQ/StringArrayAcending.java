package CAPGQ;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayAcending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter names");
        String arr[] = new String[5];

        for(int i=0;i<arr.length;i++) {
            arr[i] = scan.nextLine();
        }
//        System.out.println("Names in the list");
//        for(int i=0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println("After sorting...");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
                }
    }
}
