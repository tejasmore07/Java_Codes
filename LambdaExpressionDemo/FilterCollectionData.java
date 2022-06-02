package LambdaExpressionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class $Products {
    int id, warrenty;
    String name;
    float price;

    public $Products(int id,String name,float price,int warrenty) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.warrenty=warrenty;
    }
}
public class FilterCollectionData {
    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        list.add(new Products(1,"Samsung",57000f,3));
        list.add(new Products(2,"Vivo",20000f,2));
        list.add(new Products(3,"Apple",90000f,5));
        list.add(new Products(4,"Poco",1000f,1));
        list.add(new Products(5,"Sony Xperia",30000f,2));

        //Implementing lambda expression...
        Stream<Products> filterData = list.stream().filter(p->p.price>=30000);

        filterData.forEach($Products -> System.out.println($Products.id+" "+$Products.name+" "+$Products.price));

    }
}

