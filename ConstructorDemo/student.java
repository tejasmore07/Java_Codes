package ConstructorDemo;

public class student {                         // class define

    private String name;                       // global variable
    private int age;
    private int roll_no;

  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name=name;                           // name- local variable
  }
  public int getAge(){
      return age;
  }
  public void setAge(int age) {
      if (age >= 18){
          this.age = age;
      } else {
          System.out.println("Your Under Age");
      }
  }
  public int getRoll_no(){
      return roll_no;
  }
  public void setRoll_no(int roll_no){
      this.roll_no = roll_no;                   // using this. - local to global
  }
}

class Info {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Tejas More");
        s1.setAge(21);
        s1.setRoll_no(162336);
        System.out.println("Name - " + s1.getName());
        System.out.println("Age - " + s1.getAge());
        System.out.println("Roll no. - " + s1.getRoll_no());
        System.out.println();

        student s2 = new student();
        s2.setName("Rohit Gadkari");
        s2.setAge(22);
        s2.setRoll_no(162337);
        System.out.println("Name - " + s2.getName());
        System.out.println("Age - " + s2.getAge());
        System.out.println("Roll no. - " + s2.getRoll_no());
        System.out.println();

        student s3 = new student();
        s3.setName("Mihir Joshi");
        s3.setAge(16);
        s3.setRoll_no(162338);
        System.out.println("Name - " + s3.getName());
        System.out.println("Age - " + s3.getAge());
        System.out.println("Roll no. - " + s3.getRoll_no());
        System.out.println();
    }
}
