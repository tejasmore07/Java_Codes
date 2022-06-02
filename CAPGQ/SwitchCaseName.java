package CAPGQ;

import java.util.Scanner;

public class SwitchCaseName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name\n Available names are\n tejas,mihir,prasanna");
        String name = scan.nextLine();

        switch(name) {
            case "tejas" :
                System.out.println("User[userId=101,emailId=tejasmore@gmail.com,passward=welcome@123,\nfirstName=Tejas,LastName=More,city=A'bad,gender=male,\nphoneNo=123456789]");
                break;
            case "prasanna" :
                System.out.println("User[userId=102,emailId=prasanna03@gmail.com,passward=welcome@123,\nfirstName=prasanna,LastName=suryawanshi,city=A'bad,gender=male,\nphoneNo=123456789]");
                break;
            case "mihir" :
                System.out.println("User[userId=103,emailId=joshimihir@gmail.com,passward=welcome@123,\nfirstName=mihir,LastName=joshi,city=A'bad,gender=male,\nphoneNo=123456789]");
                break;
            default:
                System.out.println("No User Name Found");
        }
    }
}
