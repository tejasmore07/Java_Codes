package SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {
    public static void main(String[] args) {
        Project p1 = new Project();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        p1.f_name = scan.nextLine();
        System.out.println("Enter your last name : ");
        p1.l_name = scan.nextLine();
        System.out.println("Enter your Address : ");
        p1.address = scan.nextLine();
        System.out.println("Enter Age : ");
        p1.age = scan.nextInt();

        System.out.println("Enter your Company name : ");
        p1.company_name = scan.next();
        System.out.println("Enter your ID : ");
        p1.id = scan.nextInt();
        System.out.println("Enter your salary : ");
        p1.salary = scan.nextDouble();

        System.out.println("Enter your Department : ");
        p1.department = scan.next();
        System.out.println("Enter no of employee : ");
        p1.no_of_employee = scan.nextInt();

        System.out.println("Enter your project name : ");
        p1.project_name = scan.next();
        System.out.println("Enter Duration in Month : ");
        p1.duration = scan.next();

        try{
            FileOutputStream fileout = new FileOutputStream("D:\\Study video\\java practice\\Demo_project.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(p1);
            out.close();
            fileout.close();
            System.out.println("Serialization data is saved....");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
