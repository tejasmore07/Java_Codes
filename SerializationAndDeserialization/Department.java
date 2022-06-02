package SerializationAndDeserialization;

import java.io.Serializable;

public class Department extends Employee implements Serializable {
    int no_of_employee;
    String department;

//    public void dep(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your Department : ");
//        String department = scan.nextLine();
//        System.out.println("Enter no of employee : ");
//        int no_of_employee = scan.nextInt();
//    }
//    public void dep2(){
//        System.out.println("Department : " + department);
//        System.out.println("No of Employee : "+ no_of_employee);
//    }
}
