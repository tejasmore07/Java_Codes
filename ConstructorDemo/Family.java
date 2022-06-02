package ConstructorDemo;

class Fam {
    String name,last_name,add;
    char gen;
    int age,pin_code;

    Fam(String name,String last_name,int age,char gen,String add,int pin_code) {
        this.name = name; this.last_name = last_name;
        this.age = age; this.gen = gen;
        this.add = add; this.pin_code = pin_code;
    }
    void Info(){
        System.out.println("Family Information - ");
        System.out.println();
    }
    void Display() {
        System.out.println("First name : " + name );
        System.out.println("last name : " + last_name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gen);
        System.out.println("Address : " + add + pin_code);
        System.out.println("---------------------------------------");
    }
}
public class Family {
    public static void main(String[] args) {

        Fam f1 = new Fam("Tejas","More",21,'M',"Aurangabad-",431001);
        Fam f2 = new Fam("Shreyas","More",19,'M',"Aurangabad-",431001);
        Fam f3 = new Fam("Prasanna","Suryawanshi",22,'M',"Aurangabad-",431001);
        Fam f4 = new Fam("Rohit","Gadkari",22,'M',"Pune-",43521);
        Fam f5 = f1;      //copy constructor

        f1.Info(); f1.Display();
        f2.Info(); f2.Display();
        f3.Info(); f3.Display();
        f4.Info(); f4.Display();
        //f5.Info(); f5.Display();
    }
}
