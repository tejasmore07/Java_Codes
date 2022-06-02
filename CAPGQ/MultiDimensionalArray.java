package CAPGQ;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] arr = new String[2][2];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                arr[i][j] = scan.next();
            }
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++) {
             for(int j=0;j<arr.length;j++) {
              Arrays.sort(arr[i]);
            }
        }
        System.out.println(" After sorting Array elements are : ");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
