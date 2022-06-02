package CurrencyDemo;


import java.text.NumberFormat;
import java.util.Locale;

public class Currency_Demo {
    static void printcurrency(Locale lo){
        double d = 45.25;
        NumberFormat nf = NumberFormat.getCurrencyInstance(lo);
        String currency = nf.format(d);
        System.out.println(currency + " for this local " + lo);
    }
    static void printcurrency1(){
        double d = 44585.25;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String currency = nf.format(d);
        System.out.println(currency);

    }
    public static void main(String[] args) {
        printcurrency(Locale.CANADA);
        printcurrency(Locale.TAIWAN);
        printcurrency(Locale.ITALY);
        printcurrency(Locale.CHINESE);
        //for india
        printcurrency1();

    }
}
