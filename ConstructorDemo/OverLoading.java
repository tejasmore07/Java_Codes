package ConstructorDemo;

class Show{
    int a,b,c,d;
    String name;
    Show(int a,int b) {
        this.a = a;
        this.b = b;
    }
    Show(int d,String b) {
        this.d = d;
        this.name=b;
    }
    void add() {
        c= a + b;
        System.out.println( "Sum is " + c);
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Show s1 = new Show(10,20);
        Show s2 = new Show(20,100);
        Show s3 = new Show(5,"Tejas");
        Show s4 = s2;

        s1.add();
        s2.add();
        s3.add();
        s4.add();

    }
}
