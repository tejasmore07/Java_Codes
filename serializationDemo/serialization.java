package serializationDemo;
import java.io.Serializable;

public class serialization implements Serializable {
     String name,address;
     int age,id;

    public void display(){
        System.out.println("Employee info " + "\nName : " + name +"\nAge : "+ age +"\nID : " +id +"\nAddress : "+ address );
    }
}

