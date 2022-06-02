package ConstructorDemo;

class phone_info {
    private String name;
    private String color;
    private int price;

    public void setMethod(String name,String color,int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    void display() {
        System.out.println("Brand : " + getName());
        System.out.println("Colour : " + getColor());
        System.out.println("Price : " + getPrice());
    }
}
public class Mobile {
    public static void main(String[] args) {
        phone_info pi = new phone_info();
        pi.setMethod("Samsung","Black",19500);
        pi.display();
    }
}
