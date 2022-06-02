package ConstructorDemo;

class Show_1 {
    int id;
    String name;

    void Display(){
        System.out.println(id + " " + name);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Show_1 s1 = new Show_1();           //default constructor
        Show_1 s2 = new Show_1();
        s1.Display();
        s2.Display();
    }
}
