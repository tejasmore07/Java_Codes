package ArrayCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueueDemo {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.addFirst("First line");
        dq.add("Prasa");
        dq.add("zakir");
        dq.offer("3");
        dq.addLast("Last line");
        dq.offerLast("1");
        dq.offerFirst("2");


//        for(String str : dq) {
//            System.out.println(str);
//        }
        System.out.println(dq);
    }
}
