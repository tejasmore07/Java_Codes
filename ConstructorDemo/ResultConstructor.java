package ConstructorDemo;

class Sum {
    int a,b,c;
    Sum(int a,int b) {
        this.a = a;
        this.b = b;
    }
    void Display() {
        c = a + b;
        System.out.println("Sum is : " + c);
    }
}
public class ResultConstructor {
    public static void main(String[] args) {
        Sum s1 = new Sum(10,20);
        Sum s2 = new Sum(155,200);
        Sum s3 = new Sum(-5,85);
      //    s1=s3;            //copy constructor

        s1.Display();
        s2.Display();
        s3.Display();
    }
}
