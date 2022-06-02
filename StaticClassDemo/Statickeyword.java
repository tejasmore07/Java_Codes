package StaticClassDemo;

class student{
    String name;
    int roll;
    student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public static String college_name="DIETMS";
    static void change_clg(){
        college_name="MIT";
    }

    void display(){
        System.out.println(name + "-" + roll + "-" + college_name);
    }

}
public class Statickeyword {
    public static void main(String[] args) {
        student.change_clg();
        student a=new student("Prasad" , 12);
        student a1=new student("Tejas" , 22);
        student a2=new student("Yash" , 92);
        a.display();
        a1.display();
        a2.display();
    }
}