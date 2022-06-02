package SerializationAndDeserialization;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    int id;
    double salary;
    String company_name;

//    public void emp(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your Company name : ");
//        String company_name = scan.nextLine();
//        System.out.println("Enter your ID : ");
//        int id = scan.nextInt();
//        System.out.println("Enter your salary : ");
//        double salary = scan.nextDouble();
//    }
//    public void emp2(){
//        System.out.println("ID : "+id);
//        System.out.println("Salary : "+salary);
//        System.out.println("Company name : "+ company_name);
//    }
}
