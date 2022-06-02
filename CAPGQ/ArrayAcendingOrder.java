package CAPGQ;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAcendingOrder {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Size of array");
        n=scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array elements are");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("After Sorting Array elements are");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

