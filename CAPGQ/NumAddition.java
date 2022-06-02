package CAPGQ;

import java.util.Scanner;

public class NumAddition {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int no,sum=0,temp=0;
            System.out.println("enter a number ");
            no=sc.nextInt();
            while(no>0)
            {
                sum=sum+no%10;
                no=no/10;
            }
            System.out.println("sum ="+sum);
        }
    }

