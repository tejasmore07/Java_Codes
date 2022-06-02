package NumberFormatClass;

import java.text.NumberFormat;

public class NumberFormat_Demo {
    public static void main(String[] args) {
        double  d = 154985.26459;
        System.out.println("Double value is : " + d);

        NumberFormat nf = null;
        nf=NumberFormat.getInstance();
        System.out.println("Formatted as Number : " + nf.format(d));

        nf.setMaximumIntegerDigits(2);
        nf.setMinimumFractionDigits(3);
        System.out.println("Formatted as max 2 digits : " + nf.format(d));

        nf.setMaximumIntegerDigits(3);
        nf.setMinimumFractionDigits(1);
        System.out.println("Formatted as max 3 digits : " + nf.format(d));

        nf=NumberFormat.getCurrencyInstance();
        System.out.println("Formatted as Currency : " + nf.format(d));

    }
}
