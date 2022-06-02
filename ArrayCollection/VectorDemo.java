package ArrayCollection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Tejas");
        list.add("prasanna");
        list.add("prasad");
        list.add("pritish");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
//        Iterator itr1 = list.iterator();
//        while (itr1.hasNext()) {
//            System.out.println("After Clearing");
//            list.clear();
//        }


    }
}
