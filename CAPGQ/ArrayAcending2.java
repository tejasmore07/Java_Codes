package CAPGQ;

import java.util.Scanner;

public class ArrayAcending2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of array");
        n = scan.nextInt();
       int arr[] = new int[n];

       for(int i=0;i<n;i++) {
           arr[i] = scan.nextInt();
       }
        System.out.println("Array elements are");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("After DSorting Array elements are");
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int temp = 0;
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
