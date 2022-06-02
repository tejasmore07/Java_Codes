package SetDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Tejas");
        ts.add("Prasanna");
        ts.add("Zakir");
        ts.add("Mihir");
        ts.add("");
        ts.add("Atharv");

        System.out.println(ts);
    }
}
