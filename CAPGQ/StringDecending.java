package CAPGQ;

import java.util.Scanner;

public class StringDecending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  userid[] = new String[5];
        for(int i=0;i<userid.length;i++) {
            userid[i] = scan.nextLine();
        }
        for(int i=0;i< userid.length;i++) {
            for(int j=i+1;j<userid.length;j++) {
                if(userid[i].compareTo(userid[j])<0 ) {
                    String temp = userid[i];
                    userid[i] = userid[j];
                    userid[j] = temp;
                }
            }
            System.out.println(userid[i]);
        }
    }
}
