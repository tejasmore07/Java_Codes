package BasicCodes;

public class swapTwoNo {
    public static void main(String[] args) {
        // without using third variable
        int a,b,temp;
        a = 169;
        b = 268;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping: " + ("a = " + a) + " & " + ("b = " + b));

        // with using third variable

        temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping: " + ("a = " + a) + " & " + ("b = " + b));


    }
}
