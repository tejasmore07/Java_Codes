package ArraysClassDemo;

class Student1 {
    int roll_no,age;
    String name;

    Student1(int roll_no,String name,int age){
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }
}
public class SimpleArray {
    public static void main(String[] args) {
        Student1 s1[];
        s1 = new Student1[5];
        s1[0] = new Student1(1,"zoro",35);
        s1[1] = new Student1(2,"Sanji",32);
        s1[2] = new Student1(3,"Nami",25);
        s1[3] = new Student1(4,"Chopper",20);
        s1[4] = new Student1(5,"Brok",50);

        for(int i = 0; i < s1.length;i++) {
            System.out.println("Student info " + i + " : " + s1[i].name + " " + s1[i].roll_no + " " + s1[i].age);
        }
    }
}
