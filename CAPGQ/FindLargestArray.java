package CAPGQ;

import java.util.Scanner;

public class FindLargestArray {
    public static void main(String[] args) {
        System.out.println("size of array");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n<0) {
            System.out.println("Invalid input");
        } else {
            System.out.println("first array elements");
            int arr[] = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = scan.nextInt();
                if (arr[i] < 0) {
                    System.out.println("Invalid Input");
                }
            }

            if(n<0) {
                System.out.println("Invalid input");
            } else {
                System.out.println("second array elements");
                int arr1[] = new int[n];
                for(int i=0;i<n;i++) {
                    arr1[i] = scan.nextInt();
                    if (arr1[i] < 0) {
                        System.out.println("Invalid Input");
                    }
                }

            System.out.println("final array elements");
            int output1 [] = new int[n];
            for(int i=0;i<n;i++) {
                if(arr[i]>arr1[i]) {
                    output1[i] = arr[i];
                } else {
                    output1[i] = arr1[i];
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(output1[i]);
            }
        }
    }
    }
}
