package ConstructorDemo;// Program to print the value of name;:

class TestBean{ //clas define
    private String name;    //global variable
    private String add;
    private char gen;
    private int age;

    public void setName(String name,String add,char gen,int age){
        //setter method
        this.name=name;
        this.add=add;
        this.gen=gen;
        this.age=age;

        //assign local to global
    }
    public void getMethod(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+add );
        System.out.println("Gender : "+gen);
        System.out.println("Age : "+age);
        System.out.println("---------------------------------------------");
    }
}
class Result{
    public static void main(String[] args) {
        TestBean tb = new TestBean();
        tb.setName("Tejas More" , "Aurangabad",'M',21);
        tb.getMethod();

        TestBean tb1 = new TestBean();
        tb.setName("vaishnavi muley" , "Aurangabad",'F',17);
        tb.getMethod();

    }

}
