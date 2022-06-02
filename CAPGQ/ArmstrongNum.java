package CAPGQ;

public class ArmstrongNum {
    public static void main(String[] args) {
        int i=100;
        while(i<=999){
            int temp = i;
            int fd = temp%10;
            temp = (temp/10);
            int sd = temp%10;
            temp = (temp/10);
            int td = temp%10;
            if(i == (fd*fd*fd) + (sd*sd*sd) + (td*td*td)){
                System.out.println(i);
            }
            i++;
        }
    }

}
