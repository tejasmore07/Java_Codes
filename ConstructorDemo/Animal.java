package ConstructorDemo;

class Dog {
    private String breed;
    private int age;
    private String color;

    public void setBreed(String breed) {

        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    void display(){
        System.out.println("Breed : " + getBreed());
        System.out.println("Age : " + getAge());
        System.out.println("Color : " + getColor());
    }

}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setBreed("German");
        d.setAge(5);
        d.setColor("Black");
        d.display();

    }
}
