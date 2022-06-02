package ArrayCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tejas");
        list.add("prasanna");
        list.add("prasad");
        list.add("pritish");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
