package LambdaExpressionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Products {
    int id, warrenty;
    String name;
    float price;

    public Products(int id,String name,float price,int warrenty) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.warrenty=warrenty;
    }
}
public class UsingComparator {
    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        list.add(new Products(1,"Samsung",500000f,3));
        list.add(new Products(2,"Vivo",600000f,2));
        list.add(new Products(3,"Apple",900000f,5));

        System.out.println("Sorting on the basic of the name : ");

        //Implementing lambda expression...
        Collections.sort(list,(p1,p2)-> {
            return p1.name.compareTo(p2.name);
        });
        for(Products p : list) {
            System.out.println(p.id +" "+ p.name+" "+p.price+" "+p.warrenty);
        }
    }
}
