package CAPGQ;

import java.util.Scanner;
public class CalculateSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        if(a>8000) {
            System.out.println("Salary too large");
        }
        int b = scan.nextInt();
        if(b<0) {
            System.out.println("Shift too small");
        } else {
            double f_t = a*(50.0/100.0);
            double saving = a-(f_t);
            double saving_f = saving+((a*0.02)*b);
            int i = (int)saving_f;
            System.out.println(i);
        }
        if(a<0){
            System.out.println("Salary too small");
        }
    }
}
