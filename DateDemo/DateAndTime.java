package DateDemo;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(1555555456999l);
        Date d3 = new Date(999l);

        System.out.println("First Date : "+d1);
        System.out.println("Second Date : "+d2);
        System.out.println("Third Date : "+d3);

        if(d1.after(d2)) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        if(d2.before(d3)) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        d3.setTime(d3.getTime() + 999945459999l);
        System.out.println("New Updated date : " + d3);

        if(d3.after(d1)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
