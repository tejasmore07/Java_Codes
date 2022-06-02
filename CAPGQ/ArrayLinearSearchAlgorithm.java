package CAPGQ;

import java.util.Scanner;

public class ArrayLinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter names size :");
        int n = scan.nextInt();
        String arr[] = new String[n+1];
        System.out.println("Enter names : ");

        for(int i=0;i<=n;i++){
            arr[i] = scan.nextLine();
        }
        System.out.println("enter to search : ");
        String m = scan.nextLine();

        for(int i=0;i<=n;i++) {
            if(arr[i].equals(m)){
                System.out.println("Name " + arr[i] + " Found at " + i);
                return;
            }
        }
        System.out.println("Elements not found");
    }
}
