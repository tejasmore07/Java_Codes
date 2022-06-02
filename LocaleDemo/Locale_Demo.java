package LocaleDemo;

import java.util.Locale;

public class Locale_Demo {
    public static void main(String[] args) {
        Locale lc[] = Locale.getAvailableLocales();
       int i =0;

       for(Locale lc1 : lc){
           i++;

           System.out.println("Country : " + lc1.getDisplayCountry());
           System.out.println("Language : " + lc1.getDisplayLanguage());

           if(i>10)
               break;
       }
    }
}
