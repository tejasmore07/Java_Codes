package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo  {    //signature (throws)
    public static void main(String[] args) throws IOException,ClassNotFoundException {
            Project p1 = null;

            FileInputStream filein = new FileInputStream("D:\\Study video\\java practice\\Demo_project.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            p1=(Project) in.readObject();
            filein.close();
            in.close();

            System.out.println("First Name : " +p1.f_name);
            System.out.println("Last Name : "+p1.l_name);
            System.out.println("Address : "+p1.address);
            System.out.println("Age : "+p1.age);
            System.out.println("ID : "+p1.id);
            System.out.println("Salary : "+p1.salary);
            System.out.println("Company name : "+p1.company_name);
            System.out.println("Department : " + p1.department);
            System.out.println("No of Employee : "+ p1.no_of_employee);
            System.out.println("Project Name : "+ p1.project_name);
            System.out.println("Duration : "+p1.duration);

    }

}
