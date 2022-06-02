package CharDemo;

public class CharAtDemo {
    public void Display_1() {
        String str = "Welcome To Fuel Organization";
        for(int i = 0;i<=str.length()-1;i++) {
            if(i%2 == 0) {
                System.out.println("Char At " + i + " : " + str.charAt(i));
            }
        }
        System.out.println();
        for(int i = 0;i<=str.length()-1;i++) {
            if (i%2 != 0) {
                System.out.println("Char At " + i + " : " + str.charAt(i));
            }
        }
    }
}
