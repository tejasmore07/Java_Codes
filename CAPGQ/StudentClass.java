package CAPGQ;
class Student{
    private String f_name;
    private String l_name;
    private String class_year;
    private String major;

    public void setF_name(String f_name){
        this.f_name=f_name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setL_name(String l_name){
        this.l_name = l_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setClass_year(String class_year) {
        this.class_year=class_year;
    }

    public String getClass_year() {
        return class_year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    public void display() {
        System.out.println("First Name : " + getF_name());
        System.out.println("Last Name : " + getL_name());
        System.out.println("Class year : " + getClass_year());
        System.out.println("Major : " + getMajor());
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setF_name("Tejas");
        s1.setL_name("More");
        s1.setClass_year("Final");
        s1.setMajor("Mechanical");
        s1.display();

        System.out.println("************************");

        Student s2 = new Student();
        s1.setF_name("prasanna");
        s1.setL_name("Suryawanshi");
        s1.setClass_year("Final");
        s1.setMajor("Mechanical");
        s1.display();

    }
}
