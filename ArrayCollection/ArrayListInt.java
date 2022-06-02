package ArrayCollection;

import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args)  {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=1;i<=5;i++) {
            a.add(i);
            System.out.println(a);
        }
        System.out.println();

//   remove value at index 3
        a.remove(3);
        System.out.println(a);

//    add elements 100 to index 2
        a.add(2,100);
        System.out.println(a);

//   copy the same object
//        a.iterator();
//        System.out.println(a);

//    Removes all the elements
//        a.removeAll(a);
//        System.out.println(a);

//    convert collection to array
//        a.toArray();
//        System.out.println(a);

//        print in true or false
        a.isEmpty();
        System.out.println(a);

//        a.stream();
//        System.out.println(a);

    }
}
