package GameJava;

import java.util.Scanner;

public class Switch_Ex_01 {

    public void Switch() {
        Scanner scan = new Scanner(System.in);
        System.err.println("Press any Button for Calculation : ");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 to Check Even or Odd ");
        System.out.println("Press 6 For n table");
        System.out.println("Press 7 For n Power");
        System.out.println("Press 8 For print Alphabets");
        System.out.println("Press 9 For Pattern");
        System.out.println("Press 10 To Play Game");
        int button = scan.nextInt();

        switch (button) {
            case 1 : System.out.println("Enter a value");
                int a = scan.nextInt();
                System.out.println("Enter b value");
                int b = scan.nextInt();
                int c =  a + b;
                System.out.println("Addition is : " + c);
                break;
            case 2 : System.out.println("Enter a value");
                int a1 = scan.nextInt();
                System.out.println("Enter b value");
                int b1 = scan.nextInt();
                int d = a1 - b1;
                System.out.println("Subtraction is : " + d);
                break;
            case 3 : System.out.println("Enter a value");
                int a2 = scan.nextInt();
                System.out.println("Enter b value");
                int b2 = scan.nextInt();
                int e = a2 * b2;
                System.out.println("Multiplication is : " + e);
                break;
            case 4 : System.out.println("Enter a value");
                int a3 = scan.nextInt();
                System.out.println("Enter b value");
                int b3 = scan.nextInt();
                int f = a3 / b3;
                System.out.println("Division is : " + f);
                break;
            case 5 : System.out.println("Enter a no to check Even or Old : ");
                int g = scan.nextInt();
                if(g % 2 == 0) {
                    System.out.println("Number is Even");
                } else {
                    System.out.println("Number is Old");
                } break;
            case 6 : int sum = 0;
                System.out.println("Enter Your n Value: ");
                int n = scan.nextInt();
                for(int i = 1; i <= 10; ++i) {
                    int z = n * i;
                    sum += z;
                    System.out.println(n + " x " + i + " = " + z);
                } break;
            case 7 : int result = 1;
                System.out.println("enter a number: ");
                int n1 = scan.nextInt();
                System.out.println("enter a power: ");
                int p = scan.nextInt();
                for(int i = 1; i <= p; ++i) {
                    result = n1 * result;
                } System.out.println(result);
                break;
            case 8 : for(char i = 'A'; i <= 'Z'; ++i) {
                    System.out.print(i + " ");
                } break;
            case 9 : System.out.println("Enter number to print");
                int n3 = scan.nextInt();
                int n2 = n3;
                for(int i = 0; i<=n2;i++) {
                    for(int j = 0; j<=n2;j++) {
                        if(i==0 || j==0 || i==n2 || j==n2) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }System.out.println();
                } break;
            case 10 : int myNumber = (int)(Math.random() * 50.0D);
                boolean var3 = false;
                int UserNumber;
                do {
                    System.out.println(" Guess the Number(1 - 50) : ");
                    UserNumber = scan.nextInt();
                    if (UserNumber == myNumber) {
                        System.out.println("Sahi Jawab");
                        break;
                    }
                    if (UserNumber > myNumber) {
                        System.out.println("Thoda km kr");
                    } else {
                        System.out.println("Thoda bada kr");
                    }
                } while(UserNumber >= 0);

                System.out.print("Yeh tha : ");
                System.out.println(myNumber);
                break;
            default:
                System.out.println("Invalid Option!!!");
        }
    }
}
