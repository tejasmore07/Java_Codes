package CharDemo;

public class CharAtDemo_2 {
    public void Display_2 () {
        String str_1 = "They produce electricity and heat as long as fuel is supplied";
        for(int i =0;i<=str_1.length()-1;i++) {
            if(i%2 ==0) {
                System.out.println("Char At "+ i + " : " + str_1.charAt(i));
            }
        }
        System.out.println("String Length " + str_1.length());
    }
}
