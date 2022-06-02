package CAPGQ;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name : ");
        String name = scan.nextLine();

         String a = name.toUpperCase();
        System.out.println(a);
    }
}
