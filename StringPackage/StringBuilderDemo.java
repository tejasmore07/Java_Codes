package StringPackage;

import java.util.Scanner;

public class StringBuilderDemo {
    public void Display() {
        StringBuilder str = new StringBuilder("Hello ");

        System.out.println("String capacity : " + str.capacity());

        str.append("Java");
        System.out.println("Use append :" + str);

        str.insert(10," tejas");
        System.out.println("Use insert :" + str);

        str.reverse();
        System.out.println("Use reverse :" + str);

        str.delete(0,5);
        System.out.println("use delete :" +str);

        str.reverse();
        System.out.println("After reverse :" + str);

        str.replace(11,12,"- final string");
        System.out.println("Use replace :" + str);
    }

}
