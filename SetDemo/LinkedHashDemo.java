package SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(99);
        lhs.add(0);
        lhs.add(60);
        lhs.add(100);
        lhs.add(50);
        lhs.add(60);

        System.out.println(lhs);
    }
}
