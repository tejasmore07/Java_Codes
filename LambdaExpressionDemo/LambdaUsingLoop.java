package LambdaExpressionDemo;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsingLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Amol");
        list.add("Manoj");
        list.add("Rahul");
        list.add("Tushar");

        list.forEach((n)->System.out.println(n));
    }
}