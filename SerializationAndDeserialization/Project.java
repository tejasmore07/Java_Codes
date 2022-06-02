package SerializationAndDeserialization;

import java.io.Serializable;

public class Project extends Department implements Serializable {
    String project_name;
    String duration;

//    public void pro(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your project name : ");
//        String project_name = scan.nextLine();
//        System.out.println("Enter Duration : ");
//        String duration = scan.nextLine();
//    }
//    public void pro2(){
//        System.out.println("Project Name : "+ project_name);
//        System.out.println("Duration : "+duration);
//    }
}
