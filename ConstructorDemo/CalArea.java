package ConstructorDemo;

class Area {
    int w,l,s;
    float r;
    Area(int w,int l){
        this.w = w;
        this.l = l;
    }
    Area(float r) {

        this.r = r;
    }
    Area(int s) {
        this.s = s;
    }
    void Rectangal() {
        int Cal = w * l;
        System.out.println("Area of Rectangal is " + Cal);
    }
    void Circle() {
        Double Cal2 = 3.14 * r * r;
        System.out.println("Area of circle is " + Cal2);
    }
    void Square() {
        float Cal3 = s * s;
        System.out.println("Area of Square is " + Cal3);
    }
}
public class CalArea {
    public static void main(String[] args) {
        Area a1 = new Area(12,10);
        Area a2 = new Area(5f);
        Area a3 = new Area(10);
        a1.Rectangal();
        a2.Circle();
        a3.Square();
    }
}
