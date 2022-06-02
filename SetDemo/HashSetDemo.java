package SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs =  new HashSet<>();
        hs.add("Tejas");
        hs.add("Prasanna");
        hs.add("Mihir");
        hs.add("Mihir");



//        Iterator<String> itr = hs.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        System.out.println(hs);

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("");
        hs1.add("1");
        hs1.add("2");
        hs1.add("3");
        System.out.println(hs1);

        boolean val = hs1.remove("2");
        System.out.println("is 2 removed " + val);
        System.out.println(hs1);

        boolean val2 = hs.removeAll(hs);
        System.out.println("Is hs elements All removed? " + val2);
        System.out.println(hs);

    }
}
