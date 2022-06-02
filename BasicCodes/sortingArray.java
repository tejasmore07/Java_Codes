package BasicCodes;

import java.util.Scanner;

public class sortingArray {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.println("enter the number of elements");
        n = scan.nextInt(); //user input store in n variable

        int arr[] = new int[n];
        System.out.println("enter the number of Array ");
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }
        int temp = 0; // temporary variable to store the value of element
        for(int i = 0; i< arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("after sorting ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
