package CAPGQ;

import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Numbers :  ");

        int arr[] = new int[5];


        for(int i=0;i< arr.length;i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array elements are");
        for(int i=0;i< arr.length;i++) {
            System.out.println("Square Number is : " + arr[i] * arr[i]);
        }
    }
}
