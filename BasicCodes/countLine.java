package BasicCodes;

import java.util.Scanner;

public class countLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter few lines: ");
        //String s = scan.nextLine();
        int i = 1;

        while(scan.hasNext()) {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }

    }
}
